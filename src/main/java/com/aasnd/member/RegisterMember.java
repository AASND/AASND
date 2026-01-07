package com.aasnd.member;

import java.util.ArrayList;
import java.util.List;

class RegisterMember {
    private final static List<Member> database = new ArrayList<>();

    void register(RegisterMemberRequest request) {
        final Member member = new Member(request.phoneNumber(), request.name());
        database.add(member);
    }
}
