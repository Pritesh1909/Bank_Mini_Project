package com.pritesh.bank.controllers;

import com.pritesh.bank.services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class GetAccountsController {

    @Autowired
    AccountService accountService;

    @ResponseBody
    @RequestMapping(value = "/get", method = RequestMethod.POST)
    public List<com.pritesh.bank.dao.AccountInformation> getAllAcoounts(){
        return accountService.getAccounts();
    }


}
