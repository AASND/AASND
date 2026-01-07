package com.aasnd.member;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
class MemberRepository {
    private final static List<Member> database = new ArrayList<>();

    void save(final Member member) {
        database.add(member);
    }
}
