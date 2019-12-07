package com.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


public class UserController {

    @RequestMapping("/")
    @ResponseBody
    String index() {
        return "";
    }

}
