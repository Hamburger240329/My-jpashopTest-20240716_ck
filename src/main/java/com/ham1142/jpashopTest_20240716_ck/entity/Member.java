package com.ham1142.jpashopTest_20240716_ck.entity;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "jpa_membertbl")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Member {

    @Id // 매핑될 테이블의 기본키 필드로 설정
    @Column(name = "membernum") // 실제 DB 테이블의 필드이름을 설정
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long membernum; // 회원번호(1부터 1씩 증가하고 기본키로 설정)

    @Column(name = "memberid", length = 20, nullable = false, unique = true)
    // 기본값이 255 이므로 20 으로 조정, 중복되는 값 없이 하나의 값으로 하겠다 = nuique
    private String memberid; // 회원 아이디

    @Column(name = "memberpw", length = 20, nullable = false)
    private String memberpw; // 회원 비밀번호

    @Column(name = "membername", length = 20, nullable = false)
    private String membername; // 회원 이름

    @Column(name = "memberage") // 실제 DB 테이블의 필드 -> memberage
    private int age; // 회원 나이

}
