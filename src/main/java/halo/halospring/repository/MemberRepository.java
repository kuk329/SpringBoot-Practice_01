package halo.halospring.repository;

import halo.halospring.domain.Member;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


public interface MemberRepository {
    Member save(Member member); // 데이터 저장
    Optional<Member> findById(Long id); // 아이디로 회원찾기
    Optional<Member> findByName(String name); // 이름으로 회원찾기
    List<Member> findAll(); // 회원 전체 출력
}
