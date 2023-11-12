package cow.cow_mvc_session.member.service;

import cow.cow_mvc_session.member.controller.dto.MemberResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cow.cow_mvc_session.member.controller.dto.MemberRequest;
import cow.cow_mvc_session.member.entity.Member;
import cow.cow_mvc_session.member.repository.MemberRepository;

@Service
public class MemberServiceImpl implements MemberService{
	//    private final MemberRepository memberRepository = new MemoryMemberRepository();
	private final MemberRepository memberRepository;

	@Autowired
	public MemberServiceImpl(MemberRepository memberRepository) {
		this.memberRepository = memberRepository;
	}


	@Override
	public void join(MemberRequest memberRequest) {
		Member member = new Member(memberRequest.getId(), memberRequest.getName());
		memberRepository.save(member);
	}

	// @Override
	// public MemberResponse join(MemberRequest memberRequest) {
	// 	Member member = new Member(memberRequest.getId(), memberRequest.getName());
	// 	memberRepository.save(member);
	// 	return MemberResponse.of(member);
	// }

	@Override
	public Member findOne(Long memberId) {
		return memberRepository.findById(memberId);
	}

	@Override
	public Member updateMember(Long memberId, String name) {
		Member member = memberRepository.findById(memberId);
		member.setName(name);
		memberRepository.save(member);
		return member;
	}

	@Override
	public Member deleteMember(Long memberId){
		Member member = memberRepository.findById(memberId);
		memberRepository.delete(member);
		return member;
	}
}