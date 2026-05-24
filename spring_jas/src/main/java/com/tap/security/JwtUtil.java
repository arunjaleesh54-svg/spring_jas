package com.tap.security;

import java.security.Key;
import java.util.Date;

import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtUtil {

    // Secret key
    private static final String SECRET =
            "mysecretkeymysecretkeymysecretkey12";

    // Generate key
    private Key key = Keys.hmacShaKeyFor(SECRET.getBytes());

    // Generate Token
    public String generateToken(String username) {

        return Jwts.builder()
                .setSubject(username)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60))
                .signWith(key, SignatureAlgorithm.HS256)
                .compact();
    }

    // Extract Username
    public String extractUsername(String token) {

        Claims claims = Jwts.parserBuilder()
                .setSigningKey(key)
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }

    // Validate Token
    public boolean validateToken(String token, String username) {

        String extractedUsername = extractUsername(token);

        return extractedUsername.equals(username);
    }
}