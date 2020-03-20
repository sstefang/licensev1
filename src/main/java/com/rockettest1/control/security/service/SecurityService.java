package com.rockettest1.control.security.service;

//We create SecurityService to provide current logged-in user and auto login user after registration

public interface SecurityService {
    String findLoggedInUsername();

    void autoLogin(String username, String password);
}