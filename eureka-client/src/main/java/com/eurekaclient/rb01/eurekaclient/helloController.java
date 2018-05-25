package com.eurekaclient.rb01.eurekaclient;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {

    @RequestMapping("/")
    public String helloPage() {

        return "eureka client - home page";
    }

}
