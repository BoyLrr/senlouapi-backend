package com.lee.senlouapicommon.service;


import com.lee.senlouapicommon.model.entity.InterfaceInfo;

/**
* @author 17623
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-09-21 23:56:40
*/
public interface InnerInterfaceInfoService  {
    /**
     * 数据库中查询模拟接口是否存在
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path,String method);
}
