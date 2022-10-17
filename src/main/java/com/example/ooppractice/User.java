package com.example.ooppractice;

public class User {
    private String password;

    public void initPassword(PasswordGenerator passwordGenerator) {
        // as-is : RandomPasswordGenerator class 를 사용하면 8자리 이하 password 가 생성될 수 있다.
//        RandomPasswordGenerator randomPasswordGenerator = new RandomPasswordGenerator();
//        String randomPassword = randomPasswordGenerator.generatePassword();

        // to-be
        String randomPassword = passwordGenerator.generatePassword();

        /**
         * 비밀번호는 최소 8자 이상 12자 이하여야 한다.
         */
        if (randomPassword.length() >= 8 && randomPassword.length() <= 12) {
            this.password = randomPassword;
        }
    }

    public String getPassword() {
        return password;
    }
}
