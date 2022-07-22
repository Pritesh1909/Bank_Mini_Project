package com.pritesh.bank.dao;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "accounts")
public class AccountInformation {

    @GeneratedValue
    @Id
    @Column(name = "number")
    private int accountNumber;

    @Column(name = "name")
    @NonNull
    private String accountName;

    @NonNull
    @Column(name = "address")
    private String accountAddress;

    @NonNull
    @Column(name = "mobile_number")
    private String mobileNumber;

    @Column(name = "available_balance")
    @GeneratedValue
    private int availableBalance;

    @Column(name = "user_id")
    private String bankEmployee;

    @Override
    public String toString() {
        return "AccountInformation{" +
                "accountNumber=" + accountNumber +
                ", accountName='" + accountName + '\'' +
                ", accountAddress='" + accountAddress + '\'' +
                ", mobileNumber='" + mobileNumber + '\'' +
                ", availableBalance=" + availableBalance +
                ", bankEmployee='" + bankEmployee + '\'' +
                '}';
    }

    public String getBankEmployee() {
        return bankEmployee;
    }

    public void setBankEmployee(String bankEmployee) {
        this.bankEmployee = bankEmployee;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    @NonNull
    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(@NonNull String accountName) {
        this.accountName = accountName;
    }

    @NonNull
    public String getAccountAddress() {
        return accountAddress;
    }

    public void setAccountAddress(@NonNull String accountAddress) {
        this.accountAddress = accountAddress;
    }

    @NonNull
    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(@NonNull String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public int getAvailableBalance() {
        return availableBalance;
    }

    public void setAvailableBalance(int availableBalance) {
        this.availableBalance = availableBalance;
    }

}
