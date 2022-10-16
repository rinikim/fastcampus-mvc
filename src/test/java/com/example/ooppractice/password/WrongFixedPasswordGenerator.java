package com.example.ooppractice.password;

import com.example.ooppractice.password.PasswordGenerator;

public class WrongFixedPasswordGenerator implements PasswordGenerator {
    @Override
    public String generatePassword() {
        return "ab";    // 2글자
    }
}
