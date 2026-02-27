package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    /**
     * 一个非常简单的登录接口示例：
     * 仅做用户名/密码匹配演示，不做真正的认证与安全处理。
     *
     * 示例：
     * POST http://localhost:8080/login?username=admin&password=123456
     */
    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestParam String username,
                                        @RequestParam String password) {
        // 简单演示：用户名为 admin 且密码为 123456 认为登录成功
        if ("admin".equals(username) && "123456".equals(password)) {
            return ResponseEntity.ok("登录成功");
        }

        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("用户名或密码错误");
    }
}

