package com.cs.nju.service;

import org.apache.hadoop.hbase.filter.FilterList.Operator;

import com.cs.nju.service.model.HbaseRow;
import com.cs.nju.service.model.HbaseServiceConditonModel;

import java.io.IOException;
import java.util.Collection;
import java.util.List;


public interface HBaseService {

    void showTables() throws Exception;

    /**
     * 插入单行
     * @param tableName
     * @param row
     * @throws IOException
     */
    void saveOrUpdate(String tableName, HbaseRow row) throws IOException;
    /**
     * 插入多行
     * @param tableName
     * @param row
     * @throws IOException
     */
    void saveOrUpdates(String tableName, Collection<HbaseRow> row) throws IOException;
    /**
     * 根据行键删除
     * @param tableName
     * @param rowKey
     * @param colFamily
     * @param col
     * @throws IOException
     */
    void delete(String tableName, String rowKey, String colFamily, String col) throws IOException;
    /**
     * 根据行键列表批量删除
     * @param tableName
     * @param rowKeys
     * @param colFamily
     * @param col
     * @throws IOException
     */
    void deletes(String tableName, Collection<String> rowKeys, String colFamily, String col) throws IOException;
    /**
     * 根据行键获取数据
     * @param tableName
     * @param rowKey
     * @param colFamily
     * @param col
     * @return
     */
    HbaseRow findById(String tableName, String rowKey, String colFamily, String col) throws IOException;
    /**
     * 根据行键列表获取数据
     *
     * @param tableName 表名�?
     * @param rowKeys RowKey列表
     * @param colFamily 列族名称
     * @param col 列名�?
     * @throws IOException
     */
    List<HbaseRow> findByIds(String tableName, Collection<String> rowKeys, String colFamily, String col) throws IOException;
    /**
     * 根据行键正则或�?�条件获取数�?
     * @param tableName
     * @param rowRegexps
     * @param colFamily
     * @param col
     * @param conditions
     * @param op
     * @return
     * @throws IOException
     */
    List<HbaseRow> findByIdRegexpAndCondition(String tableName, Collection<String> rowRegexps,String colFamily, String col,Collection<HbaseServiceConditonModel> conditions,Operator op)  throws IOException;

}
