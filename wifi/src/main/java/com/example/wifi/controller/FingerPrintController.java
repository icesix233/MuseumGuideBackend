package com.example.wifi.controller;

import com.example.wifi.service.FingerPrintService;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.example.wifi.bean.*;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 *
 * 有关用户信息的业务处理层
 *
 */
@RestController
@RequestMapping("/collection")
public class FingerPrintController {
    @Resource
    private FingerPrintService fingerPrintService;

    static Gson gson=new GsonBuilder().serializeNulls().create();

    @PostMapping("/collection")
    public String collection(String json) {
        System.out.println(json);
        FingerPrint fingerPrint=gson.fromJson(json,FingerPrint.class);
        fingerPrintService.insertFingerPrint(fingerPrint);
        return "SUCCESS";
    }

}
