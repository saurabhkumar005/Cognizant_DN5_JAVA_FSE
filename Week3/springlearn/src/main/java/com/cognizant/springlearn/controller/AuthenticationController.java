package com.cognizant.springlearn.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import java.util.Date;

@RestController
public class AuthenticationController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AuthenticationController.class);

    private static final SecretKey SECRET_KEY = Keys.hmacShaKeyFor(
            "secretkeysecretkeysecretkey12345".getBytes(StandardCharsets.UTF_8)
    );

    @GetMapping("/authenticate")
    public Map<String, String> authenticate(@RequestHeader("Authorization") String authHeader) {
        LOGGER.info("START");
        LOGGER.debug("Authorization Header : {}", authHeader);
        String user = getUser(authHeader);
        LOGGER.debug("Authenticated User : {}", user);
        Map<String, String> map = new HashMap<>();
        String token = generateJwt(user);
        map.put("token", token);
        LOGGER.info("END");
        return map;
    }

    private String getUser(String authHeader) {
        LOGGER.info("Inside getUser()");

        // Remove "Basic "
        String encodedCredentials = authHeader.substring(6);
        LOGGER.debug("Encoded Credentials : {}", encodedCredentials);

        // Decode Base64
        byte[] decodedBytes = Base64.getDecoder().decode(encodedCredentials);

        String credentials = new String(decodedBytes, StandardCharsets.UTF_8);
        LOGGER.debug("Decoded Credentials : {}", credentials);

        // credentials = user:pwd
        String user = credentials.substring(0, credentials.indexOf(":"));
        LOGGER.debug("User : {}", user);
        return user;
    }

    private String generateJwt(String user){
        LOGGER.info("Inside generateJwt()");
        String token = Jwts.builder()
                .subject(user)
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 20 * 60 * 1000))
                .signWith(SECRET_KEY)
                .compact();
        LOGGER.debug("Generated Token : {}", token);
        return token;
    }

}