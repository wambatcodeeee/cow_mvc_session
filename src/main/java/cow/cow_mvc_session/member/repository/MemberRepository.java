package cow.cow_mvc_session.member.repository;

import cow.cow_mvc_session.member.entity.Member;

public interface MemberRepository {

	void save(Member member);

	Member findById(Long memberId);

	void delete(Member member);
}
