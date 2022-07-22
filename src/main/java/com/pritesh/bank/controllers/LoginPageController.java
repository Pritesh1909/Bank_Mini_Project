package com.pritesh.bank.controllers;

import com.pritesh.bank.dao.UserCredentials;
import com.pritesh.bank.services.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginPageController {

    @Autowired
    LoginService loginService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/login", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String loginPage(@RequestBody UserCredentials userCredentials){
        if( userCredentials.getUserName() != null && userCredentials.getPassword() != null
                && !userCredentials.getUserName().equals("") && !userCredentials.getPassword().equals("")
                && loginService.usernameAndPasswordValidate(userCredentials.getUserName(), userCredentials.getPassword()))
            return "Employee successfully Authenticated";
        else
            return "Credentials Invalid";
        }

    }

