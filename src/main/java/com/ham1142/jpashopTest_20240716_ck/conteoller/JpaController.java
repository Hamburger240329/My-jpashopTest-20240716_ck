package com.ham1142.jpashopTest_20240716_ck.conteoller;

import com.ham1142.jpashopTest_20240716_ck.entity.Member;
import com.ham1142.jpashopTest_20240716_ck.repository.MemberRepository;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping
public class JpaController {

    @Autowired
    MemberRepository memberRepository;

    @GetMapping(value = "/hello")
    public String hello(Model model) {

        model.addAttribute("data", "헬로월드!!");

        return "helloworld";

    }

    @GetMapping(value = "/info") // 회원 정보 출력
    public String info(Model model) {

        Optional<Member> memberOptional = memberRepository.findById(1L); // 1번 회원 정보

        Member member = memberOptional.get();

        model.addAttribute("member", member);

        return "info";

    }


    @GetMapping(value = "/linkTest") // 회원 정보 출력
    public String linkTest(Model model) {

         return "linkTest";

    }

    @GetMapping(value = "/loginOk") // 회원 정보 출력
    public String loginOk(HttpServletRequest request, Model model) {

        model.addAttribute("id", request.getParameter("id"));
        model.addAttribute("pw", request.getParameter("pw"));

         return "loginOk";

    }

    @GetMapping(value = "/iftest") // 회원 정보 출력
    public String iftest(HttpServletRequest request, Model model) {

        Optional<Member> memberOptional = memberRepository.findById(1L); // 1번 회원 정보

        Member member = memberOptional.get();

        model.addAttribute("member", member);

         return "iftest";

    }


    @GetMapping(value = "/members") // 회원 정보 출력
    public String members(HttpServletRequest request, Model model) { // 모든 회숸 리스트 출력

    List<Member> memberList = memberRepository.findAll(); // 모든 회원 리스트 가져오기

    model.addAttribute("memberList", memberList);

    return "eachTest";
    }





}
