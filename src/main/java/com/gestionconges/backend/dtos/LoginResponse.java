package com.gestionconges.backend.dtos;

public class LoginResponse {
    private String token;
    private long expiresIn;

    public String getToken() {
        return token;
    }

    public LoginResponse setToken(String token) {
        this.token = token;
        return this; // Retourne l'objet LoginResponse pour le chaînage
    }

    public long getExpiresIn() {
        return expiresIn;
    }

    public LoginResponse setExpiresIn(long expiresIn) {
        this.expiresIn = expiresIn;
        return this; // Retourne l'objet LoginResponse pour le chaînage
    }
}
