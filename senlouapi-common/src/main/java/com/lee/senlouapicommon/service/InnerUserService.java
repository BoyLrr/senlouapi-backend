package com.lee.senlouapicommon.service;


import com.lee.senlouapicommon.model.entity.User;

/**
 * 用户服务
 *
 * @author yupi
 */
public interface InnerUserService {

    /**
     * 数据库中查是否已分配给用户密钥
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
