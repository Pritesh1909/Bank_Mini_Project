package com.pritesh.bank.services;

import com.pritesh.bank.dao.AccountInformation;
import com.pritesh.bank.repositories.AccountRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeleteService {

    @Autowired
    AccountRepositories accountRepositories;

    public String deleteAccount(AccountInformation accountInformation){
        try {
            accountRepositories.delete(accountInformation);
            return "Account Deleted Successfully";
        }
        catch (Exception e){
            return "Insufficient Details";
        }
    }

}
