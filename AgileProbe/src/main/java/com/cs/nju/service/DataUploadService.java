package com.cs.nju.service;

import com.cs.nju.entity.DataGroup;

/**
 * Created by lch on 2017/5/3.
 */
public interface DataUploadService {
    String PrintJson() throws Exception;
    void saveObject(DataGroup dataGroup) throws Exception;
}
