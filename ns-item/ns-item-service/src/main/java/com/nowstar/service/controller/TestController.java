package com.nowstar.service.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinminxin
 * @description
 * @date 2020/5/21 17:38
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("testIndex")
    public ResponseEntity<String> testIndex(){
        return ResponseEntity.ok("今日之星!");
    }
}
