package cow.cow_mvc_session.member.service;

import cow.cow_mvc_session.member.controller.dto.MemberRequest;
import cow.cow_mvc_session.member.controller.dto.MemberResponse;
import cow.cow_mvc_session.member.entity.Member;

public interface MemberService {

	void join(MemberRequest memberRequest);
	// MemberResponse join(MemberRequest memberRequest);

	Member findOne(Long memberId);

	Member updateMember(Long id, String name);

	Member deleteMember(Long memberId);
}

