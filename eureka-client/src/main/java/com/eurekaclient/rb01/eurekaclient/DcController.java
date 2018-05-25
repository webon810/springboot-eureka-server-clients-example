package com.eurekaclient.rb01.eurekaclient;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DcController {

    @Autowired
    DiscoveryClient discoveryClient;
    @GetMapping("/dc")
    public String dc(){
        String services = "" + discoveryClient.getServices();
        System.out.print(services);
        return services;
    }

}
