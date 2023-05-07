package com.demo.sbresttest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class DemoClass {

    @GetMapping("/home")
    public String homecotroller() {
		//adding comment to push the code to master
		// second push to master
        return "This is Home Page";
    }
}