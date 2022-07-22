package com.pritesh.bank.controllers;

import com.pritesh.bank.dao.AccountInformation;
import com.pritesh.bank.services.DeleteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AccountDeleteController {

    @Autowired
    DeleteService deleteService;

    @ResponseBody
    @DeleteMapping(value = "/deleteaccount", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String deleteAccount(@RequestBody AccountInformation accountInformation){
        String message = deleteService.deleteAccount(accountInformation);
        return message;
    }
}
