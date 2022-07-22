package com.pritesh.bank.repositories;

import com.pritesh.bank.dao.AccountInformation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepositories extends JpaRepository<AccountInformation,Integer> {

}
