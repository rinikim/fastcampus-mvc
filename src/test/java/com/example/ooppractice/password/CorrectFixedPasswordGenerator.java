package com.example.ooppractice.password;

import com.example.ooppractice.password.PasswordGenerator;

public class CorrectFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "abcdefgh";  // 8글자
    }
}
