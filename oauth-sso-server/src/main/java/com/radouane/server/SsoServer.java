package com.radouane.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ouledmoussa on 3/10/18.
 */
@EnableResourceServer
@RestController
@SpringBootApplication
public class SsoServer {

    public static void main(String[] args) {
        SpringApplication.run(SsoServer.class, args);
    }


    @RequestMapping("/")
    public String home(){
        return "SSO Server is Running";
    }
}
