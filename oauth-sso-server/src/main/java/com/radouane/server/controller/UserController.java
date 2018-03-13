package com.radouane.server.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ouledmoussa on 3/9/18.
 */
@RestController
public class UserController {

    @RequestMapping("/sso/me")
    public Principal user(final Principal principal) {
        return principal;
    }
}
