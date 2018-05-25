package com.lhfs.sbmvntest.comlhfssbmvntest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;


@RestController
public class pagehelloController {

    private static final Logger logger = Logger.getLogger(ProfileCheckController.class.getName());

    @Autowired
    private Environment environment;

    @RequestMapping("/pagehello")
    public String pagehello() {
        return "page hello without use freemarker" + environment.getActiveProfiles()[0] + " profile";
    }

}
