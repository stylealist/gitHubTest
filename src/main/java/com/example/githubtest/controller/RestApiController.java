package com.example.githubtest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

    @GetMapping(value = "/getList")
    public String getList(){
        return "getList Method";
    }
    public String getInfo() {return "getInfo";}

    @GetMapping(value = "getAdd")
    public String getAdd() {return "getAdd Method";}

    @GetMapping(value = "getFetch")
    public String getFetch() {return "getFetch Method";}


}
