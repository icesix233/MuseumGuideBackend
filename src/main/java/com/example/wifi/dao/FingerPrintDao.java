package com.example.wifi.dao;

import com.example.wifi.bean.FingerPrint;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 *
 *
 * mybatis对应数据库用户表的dao层
 * 作为针对用户表的各种业务
 *
 * 查询  插入 更新
 */
@Mapper
public interface FingerPrintDao {

    /*
    插入新的WIFI指纹
     */
    @Insert("insert into fingerprint(positionX, positionY, ss1, ss2, ss3, ss4, ss5) VALUES (#{fingerprint.positionX}, #{fingerprint.positionY}, #{fingerprint.ss1}, #{fingerprint.ss2}, #{fingerprint.ss3}, #{fingerprint.ss4}, #{fingerprint.ss5})")
    void insertFingerPrint(@Param("fingerprint") FingerPrint fingerprint);
}
