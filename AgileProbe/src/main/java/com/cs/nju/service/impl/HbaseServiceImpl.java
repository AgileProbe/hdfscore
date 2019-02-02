package com.cs.nju.service.impl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.filter.*;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

import com.cs.nju.service.model.HbaseCell;
import com.cs.nju.service.model.HbaseRow;
import com.cs.nju.service.model.HbaseServiceConditonModel;
import com.cs.nju.util.PropertiesUtil;
import com.cs.nju.service.HBaseService;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Service("HBaseService")
public class HbaseServiceImpl implements HBaseService, InitializingBean,DisposableBean {
    private static Configuration configuration;
    private Connection connection;
    private Admin admin;

    static{
        configuration = HBaseConfiguration.create();
        configuration.set("hbase.zookeeper.property.clientPort", PropertiesUtil.getZookeeperPort());
        configuration.set("hbase.zookeeper.quorum", PropertiesUtil.getZookeeperIp());
        configuration.set("hbase.master", PropertiesUtil.getHbaseIp());
        configuration.set("hbase.root.dir",PropertiesUtil.getHbaseDir());
        System.out.println("Hbase initialized");
    }
    public void afterPropertiesSet() throws Exception {
        try {
            System.out.println("begin to create connect");
            connection = ConnectionFactory.createConnection(configuration);
            admin = connection.getAdmin();
            System.out.println("Connect to Hbase Successful");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void destroy() throws Exception {
        try {
            if (null != admin) {
                admin.close();
            }
            if (null != connection) {
                connection.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showTables() throws Exception{
        // Instantiating table descriptor class
        HTableDescriptor[] tableDescriptor =admin.listTables();
        System.out.println("success to create descriptor");
        // printing all the table names.
        for (int i=0; i<tableDescriptor.length;i++ ){
            System.out.println(i);
            System.out.println(tableDescriptor[i].getNameAsString());
        }

    }
    /**
     * 插入单行
     */
    public void saveOrUpdate(String tableName, HbaseRow row) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        Put put = new Put(Bytes.toBytes(row.getRowKey()));
        for(HbaseCell cell:row.getCells()){
            put.addColumn(Bytes.toBytes(cell.getFamily()),
                    Bytes.toBytes(cell.getQualifier()), Bytes.toBytes(cell.getValue()));
        }
        table.put(put);
        table.close();
    }

    /**
     * 插入多行
     */
    public void saveOrUpdates(String tableName, Collection<HbaseRow> rows) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        List<Put> putList = new ArrayList<Put>();
        for(HbaseRow row:rows){
            Put put = new Put(Bytes.toBytes(row.getRowKey()));
            for(HbaseCell cell:row.getCells()){
                put.addColumn(Bytes.toBytes(cell.getFamily()),
                        Bytes.toBytes(cell.getQualifier()), Bytes.toBytes(cell.getValue()));
            }
            putList.add(put);
        }
        table.put(putList);
        table.close();
    }

    /**
     * 根据RowKey获取数据
     *
     * @param tableName 表名�?
     * @param rowKey RowKey名称
     * @param colFamily 列族名称
     * @param col 列名�?
     * @throws IOException
     */
    public HbaseRow findById(String tableName, String rowKey, String colFamily, String col) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        Get get = new Get(Bytes.toBytes(rowKey));
        if (colFamily != null) {
            get.addFamily(Bytes.toBytes(colFamily));
        }
        if (colFamily != null && col != null) {
            get.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
        }
        //设置只读取最新版�?
        get.setMaxVersions(1);
        Result result = table.get(get);
        HbaseRow row = praseOneRow(result);
        table.close();
        return row;
    }

    /**
     * 根据RowKey列表获取数据
     *
     * @param tableName 表名�?
     * @param rowKeys RowKey列表
     * @param colFamily 列族名称
     * @param col 列名�?
     * @throws IOException
     */
    public List<HbaseRow> findByIds(String tableName, Collection<String> rowKeys, String colFamily, String col) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        List<Get> getList = new ArrayList<Get>();
        for(String rowKey:rowKeys){
            Get get = new Get(Bytes.toBytes(rowKey));
            if (colFamily != null) {
                get.addFamily(Bytes.toBytes(colFamily));
            }
            if (colFamily != null && col != null) {
                get.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
            }
            //设置只读取最新版�?
            get.setMaxVersions(1);
            getList.add(get);
        }
        Result[] results = table.get(getList);
        List<HbaseRow> rows = new ArrayList<HbaseRow>();
        for(Result result:results){
            HbaseRow row = praseOneRow(result);
            if(row!=null){
                rows.add(row);
            }
        }
        table.close();
        return rows;
    }

    /**
     * 根据行键正则和�?�条件获取数�?
     * @param tableName
     * @param rowRegexps
     * @param colFamily
     * @param col
     * @param conditions
     * @param op
     * @return
     * @throws IOException
     */
    public List<HbaseRow> findByIdRegexpAndCondition(String tableName, Collection<String> rowRegexps,String colFamily, String col,Collection<HbaseServiceConditonModel> conditions,FilterList.Operator op) throws IOException {
        Table table = connection.getTable(TableName.valueOf(tableName));
        Scan scan = new Scan();
        if (colFamily != null) {
            scan.addFamily(Bytes.toBytes(colFamily));
        }
        if (colFamily != null && col != null) {
            scan.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
        }
        //设置只读取最新版�?
        scan.setMaxVersions(1);
        //设置条件
        List<Filter> filters = new ArrayList<Filter>();
        if(rowRegexps != null){
            for(String rowRegexp:rowRegexps){
                RowFilter filter = new RowFilter(CompareFilter.CompareOp.EQUAL, new RegexStringComparator(rowRegexp));
                filters.add(filter);
            }
        }
        if(conditions!=null){
            for(HbaseServiceConditonModel c:conditions){
                SingleColumnValueFilter filter = new SingleColumnValueFilter(Bytes.toBytes(c.getFamily()),
                        Bytes.toBytes(c.getCol()),c.getOp(),Bytes.toBytes(c.getValue()));
                filters.add(filter);
            }
        }
        if(op==null){
            op= FilterList.Operator.MUST_PASS_ONE;
        }
        FilterList filterList = new FilterList(op,filters);
        scan.setFilter(filterList);
        ResultScanner scanner = table.getScanner(scan);
        List<HbaseRow> rows = new ArrayList<HbaseRow>();
        for(Result result = scanner.next();result!=null;result = scanner.next()){
            HbaseRow row = praseOneRow(result);
            if(row!=null){
                rows.add(row);
            }
        }
        scanner.close();
        table.close();
        return rows;
    }

    /**
     * 根据行键删除
     * @param tableName
     * @param rowKey
     * @param colFamily
     * @param col
     * @throws IOException
     */
    public void delete(String tableName, String rowKey, String colFamily, String col) throws IOException {
        if (admin.tableExists(TableName.valueOf(tableName))) {
            Table table = connection.getTable(TableName.valueOf(tableName));
            Delete del = new Delete(Bytes.toBytes(rowKey));
            if (colFamily != null) {
                //删掉�?有列的所有时间戳版本
                del.addFamily(Bytes.toBytes(colFamily));
            }
            if (colFamily != null && col != null) {
                //删掉时间戳最新的�?
                //del.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
                //删掉�?有版�?
                del.addColumns(Bytes.toBytes(colFamily), Bytes.toBytes(col));
            }
            table.delete(del);
            table.close();
        }
    }

    /**
     * 根据行键列表批量删除
     * @param tableName
     * @param rowKeys
     * @param colFamily
     * @param col
     * @throws IOException
     */
    public void deletes(String tableName, Collection<String> rowKeys, String colFamily, String col) throws IOException {
        if (admin.tableExists(TableName.valueOf(tableName))) {
            Table table = connection.getTable(TableName.valueOf(tableName));
            List<Delete> deleteList = new ArrayList<Delete>();
            for(String rowKey:rowKeys){
                Delete del = new Delete(Bytes.toBytes(rowKey));
                if (colFamily != null) {
                    //删掉�?有列的所有时间戳版本
                    del.addFamily(Bytes.toBytes(colFamily));
                }
                if (colFamily != null && col != null) {
                    //删掉时间戳最新的�?
                    //del.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
                    //删掉�?有版�?
                    del.addColumns(Bytes.toBytes(colFamily), Bytes.toBytes(col));
                }
                deleteList.add(del);
            }
            table.delete(deleteList);
            table.close();
        }
    }

    private HbaseRow praseOneRow(Result result){
        if(result.getRow()!=null){
            HbaseRow row = new HbaseRow(Bytes.toString(result.getRow()));
            for(Cell cell:result.rawCells()){
                HbaseCell hcell = new HbaseCell(Bytes.toString(CellUtil.cloneFamily(cell)),
                        Bytes.toString(CellUtil.cloneQualifier(cell)),
                        Bytes.toString(CellUtil.cloneValue(cell)));
                row.addCell(hcell);
            }
            return row;
        }
        return null;
    }
}
