package com.example.ooppractice.gradecalculate;

import java.util.List;

public class GradeCalculator {
    private final Courses courses;

    public GradeCalculator(Courses courses) {
        this.courses = courses;
    }

    /**
     * 요구사항
     * 평균학점 계산 방법 = (학점수×교과목 평점)의 합계/수강신청 총학점 수
     * MVC패턴(Model-View-Controller) 기반으로 구현한다.
     * 일급 컬렉션 사용
     */
    public double calculateGrade() {
        // (학점수×교과목 평점)의 합계
        double multipliedCreditAndCourseGrade = courses.multiplyCreditAndCourseGrade();
        // 수강신청 총학점 수
        int totalCompletedCredit = courses.calculateTotalCompletedCredit();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }

}
