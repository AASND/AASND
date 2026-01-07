package com.aasnd.member;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;

@Controller
@RequiredArgsConstructor
class RegisterMember {
   private final MemberRepository memberRepository;

    void register(RegisterMemberRequest request) {
        final Member member = new Member(request.phoneNumber(), request.name());
        memberRepository.save(member);
    }
}
