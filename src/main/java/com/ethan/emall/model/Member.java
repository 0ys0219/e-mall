package com.ethan.emall.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class Member {
    private Integer id;
    private String account;

    @JsonIgnore
    private String password;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
