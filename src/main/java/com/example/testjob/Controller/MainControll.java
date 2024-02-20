package com.example.testjob.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class MainControll {

    @PostMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello";
    }
}
