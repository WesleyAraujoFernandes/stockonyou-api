package br.com.knowledge.stockonyou.models.security;

import lombok.Data;

@Data
public class AuthRequest {
    private String username;
    private String password;
}
