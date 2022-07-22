package com.pritesh.bank.services;

import com.pritesh.bank.dao.UserCredentials;
import com.pritesh.bank.repositories.CredentialsRepositories;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    CredentialsRepositories credentialsRepositories;

    public boolean usernameAndPasswordValidate(String userName, String password) {
        Optional<UserCredentials> pass = credentialsRepositories.findById(userName);
        if (pass.isPresent()) {
            UserCredentials userCredentials = pass.get();
            return userCredentials.getPassword().equals(password);
        } else return false;

    }
}
