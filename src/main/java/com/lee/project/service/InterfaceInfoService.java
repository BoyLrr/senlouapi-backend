package com.lee.project.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.lee.project.model.entity.InterfaceInfo;

/**
* @author 17623
* @description 针对表【interface_info(接口信息)】的数据库操作Service
* @createDate 2023-09-21 23:56:40
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
