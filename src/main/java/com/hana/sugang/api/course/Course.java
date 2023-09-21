package com.hana.sugang.api.course;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false, length = 50)
    private String code; // 교과목 코드

    @Column(nullable = false, length = 50)
    private String title; // 과목명
    @Column(length = 500)
    private String description; //과목설명
    @Column(nullable = false, length = 50)
    private Integer maxCount; // 최대 수강신청가능 인원 수

    private Integer currentCount;// 현재 수강신청 인원 수


    private String courseType; //교양, 전공여부 //TODO Enum 타입으로 변경

    private Integer score; // 학점

}
