package com.example.ooppractice.gradecalculate;

import java.util.List;

public class GradeCalculator {

    private List<Course> courses;

    public GradeCalculator(List<Course> courses) {
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
        double multipliedCreditAndCourseGrade = 0;
        for (Course course : courses) {
            // 학점 * 성적을 숫자로 변환한 값 (예를들어 A+ = 95점)
            multipliedCreditAndCourseGrade += course.multiplyCreditAndCourseGrade();
        }

        // 수강신청 총학점 수
        int totalCompletedCredit = courses.stream()
                .mapToInt(Course::getCredit)
                .sum();

        return multipliedCreditAndCourseGrade / totalCompletedCredit;
    }

}
