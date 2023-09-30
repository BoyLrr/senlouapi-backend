package com.lee.senlouapicommon.service;



/**
* @author 17623267424
* @description 针对表【user_interface_info(用户调用接口关系)】的数据库操作Service
* @createDate 2023-09-24 13:19:25
*/
public interface InnerUserInterfaceInfoService {


    /**
     * 调用接口统计
     *
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
