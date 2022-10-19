package com.example.ooppractice.calculatebyinterface;

public interface NewArithmeticOperator {
    boolean supports(String operator);

    int calculate(int operand1, int operand2);

}
