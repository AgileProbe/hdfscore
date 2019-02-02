package com.cs.nju.hbase.dao;

import org.springframework.stereotype.Repository;

import com.cs.nju.hbase.dataObject.GroupData;

@Repository
public class GroupDataDao extends BaseHbaseDao<GroupData>{

    public GroupDataDao() throws NoSuchFieldException, SecurityException {
        super(GroupData.class);
    }
}
