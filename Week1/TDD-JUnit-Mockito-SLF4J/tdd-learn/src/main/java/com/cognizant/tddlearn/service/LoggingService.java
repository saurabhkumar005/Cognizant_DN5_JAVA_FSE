package com.cognizant.tddlearn.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggingService {

    public void login(String username) {
        log.info("User {} is trying to login", username);
        if(username == null || username.isBlank()){
            log.warn("Username is empty");
            return;
        }
        if(username.equals("admin")){
            log.info("Admin logged in successfully");
        }else{
            log.error("Invalid username : {}", username);
        }
    }
}