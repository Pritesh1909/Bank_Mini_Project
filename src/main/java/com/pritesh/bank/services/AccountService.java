package com.pritesh.bank.services;

import com.pritesh.bank.dao.AccountInformation;
import com.pritesh.bank.dao.UserCredentials;
import com.pritesh.bank.repositories.AccountRepositories;
import com.pritesh.bank.repositories.CredentialsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    CredentialsRepositories credentialsRepositories;
    @Autowired
    AccountRepositories accountRepositories;

    public String newAccountDetails(AccountInformation accountInformation){
        accountRepositories.save(accountInformation);
        return "Account Successfully Created.";
    }


    public String newAccountCreds(UserCredentials userCredentials){
        credentialsRepositories.save(userCredentials);
        return "Employee Successfully Created.";
    }

    public List<AccountInformation> getAccounts(){
        return accountRepositories.findAll();
    }

}