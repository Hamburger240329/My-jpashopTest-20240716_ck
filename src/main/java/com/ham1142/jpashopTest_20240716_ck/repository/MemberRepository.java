package com.ham1142.jpashopTest_20240716_ck.repository;

import com.ham1142.jpashopTest_20240716_ck.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    public List<Member> findByMembername(String membername); // 회원 이름으로 검색

    public List<Member> findByMembernameLike(String membername);

    //public List<Member> findByMembernameContaining(String membername);

    public List<Member> findByMembernameOrderByAgeDesc(String membername); // 회원 이름으로 검색

    public List<Member> findAllAndOrderByAgeDesc(); // 나이 내림차순 정렬
}
