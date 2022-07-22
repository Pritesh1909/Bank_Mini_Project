package com.pritesh.bank.controllers;

import com.pritesh.bank.dao.AccountInformation;
import com.pritesh.bank.dao.UserCredentials;
import com.pritesh.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NewAccountController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/signup", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String userCredSave(@RequestBody UserCredentials userCredentials){
        String message = accountService.newAccountCreds(userCredentials);
        return message;
    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/newaccount" , consumes = MediaType.APPLICATION_JSON_VALUE)
    public String accountInfoSave(@RequestBody AccountInformation accountInformation){
        String message = accountService.newAccountDetails(accountInformation);
        return message;
    }

}
