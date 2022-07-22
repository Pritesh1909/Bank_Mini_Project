package com.pritesh.bank.repositories;

import com.pritesh.bank.dao.UserCredentials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CredentialsRepositories extends JpaRepository<UserCredentials,String> {
}
