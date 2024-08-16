package com.example.backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.backend.model.LoginModel;
import com.example.backend.repository.LogRepo;

@Service
public class SignInService {
    @Autowired 
    private LogRepo rep;
    public boolean autho( String email, String password) {
        LoginModel foundUser = rep.findById(email).orElse(null);
        if (foundUser != null && foundUser.getPass().equals(password)) {
            return true; 
        }
        return false; 
    }
     
   





}


