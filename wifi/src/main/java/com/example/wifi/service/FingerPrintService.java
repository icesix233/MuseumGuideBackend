package com.example.wifi.service;

import com.example.wifi.bean.FingerPrint;
import com.example.wifi.dao.FingerPrintDao;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 *
 * 对应userdao的service层
 *
 * 调用userdao关于数据库的操作
 */
@Service
public class FingerPrintService {
    @Resource
    private FingerPrintDao fingerPrintDao;

    public boolean insertFingerPrint(FingerPrint fingerPrint) {
        fingerPrintDao.insertFingerPrint(fingerPrint);
        return true;
    }
}
