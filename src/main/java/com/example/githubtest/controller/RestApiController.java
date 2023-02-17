package com.example.githubtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    private String ipAddr = "127.0.0.1";

    @GetMapping(value = "/getList")
    public String getList(){
        return "getList Method";
    }
    @GetMapping(value = "/getInfo")
    public String getInfo() {return "getInfo";}
    @GetMapping(value = "/getClone")
    public String getClone() {return  "getClone";}

    @GetMapping(value = "getAdd")
    public String getAdd() {return "getAdd Method";}

    @GetMapping(value = "getFetch")
    public String getFetch() {return "getFetch Method";}


    @GetMapping(value = "getIpAddr")
    public String getIpAddr() {
        return ipAddr;
    }
}
