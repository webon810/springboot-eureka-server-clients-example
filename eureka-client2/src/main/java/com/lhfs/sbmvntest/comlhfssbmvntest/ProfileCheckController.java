package com.lhfs.sbmvntest.comlhfssbmvntest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
public class ProfileCheckController {

    private static final Logger logger = Logger.getLogger(ProfileCheckController.class.getName());

    @Autowired
    private Environment environment;

    @RequestMapping("/ProfileCheck")
    public String checkProfile(){

        return "Spring boot is running" + environment.getActiveProfiles()[0] + " Profile";

    }

}
