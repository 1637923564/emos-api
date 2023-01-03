package com.example.emos.api.controller;

import com.example.emos.api.common.util.R;
import com.example.emos.api.pojo.User;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/user")
@Tag(name = "用户1", description = "用户Web接口")
public class UserController {

    @PostMapping("/checkCode")
    @Operation(summary = "检测登陆验证码")
    public R<Boolean> checkCode(@Valid @RequestBody User user) {
        System.out.println(R.success(true));
        return R.success(true);
    }
}
