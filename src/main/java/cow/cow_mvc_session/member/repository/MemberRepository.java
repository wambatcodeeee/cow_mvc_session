package cow.cow_mvc_session.member.repository;

import cow.cow_mvc_session.member.entity.Member;

import java.util.List;

public interface MemberRepository {

	void save(Member member);

	Member findById(Long memberId);

	List<Member> findAll();

	void delete(Member member);
}
