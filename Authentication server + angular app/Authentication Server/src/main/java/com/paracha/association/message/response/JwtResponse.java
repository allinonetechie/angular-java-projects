package com.paracha.association.message.response;

import java.util.Collection;

public class JwtResponse {
    private String token;
    private String type = "Bearer";
    private String username = "";
    private Collection authorities;
    private String email = " ";


    private String name = "";

    public JwtResponse(String accessToken, String username, Collection authorities, String name, String email) {
        this.token = accessToken;
        this.username = username;
        this.authorities = authorities;
        this.name = name;
        this.email = email;
    }

    public String getAccessToken() {
        return token;
    }

    public void setAccessToken(String accessToken) {
        this.token = accessToken;
    }

    public String getTokenType() {
        return type;
    }

    public void setTokenType(String tokenType) {
        this.type = tokenType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Collection getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Collection authorities) {
        this.authorities = authorities;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}