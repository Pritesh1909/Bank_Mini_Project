package com.pritesh.bank.dao;

import org.springframework.lang.NonNull;

import javax.persistence.*;

@Entity
@Table(name = "user_creds")
public class UserCredentials {

    @Id
    @Column(name = "id")
    @NonNull
    private String userName;

    @Column(name = "password")
    @NonNull
    private String password;

    @Column(name = "employee_name")
    private String empName;

    @NonNull
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(@NonNull String empName) {
        this.empName = empName;
    }

    @Override
    public String toString() {
        return "UserCredentials{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", empName='" + empName + '\'' +
                '}';
    }

    @NonNull
    public String getUserName() {
        return userName;
    }

    public void setUserName(@NonNull String userName) {
        this.userName = userName;
    }

    @NonNull
    public String getPassword() {
        return password;
    }

    public void setPassword(@NonNull String password) {
        this.password = password;
    }
}
