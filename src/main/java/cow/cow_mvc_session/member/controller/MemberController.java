package cow.cow_mvc_session.member.controller;

import org.springframework.web.bind.annotation.*;

import cow.cow_mvc_session.member.controller.dto.MemberRequest;
import cow.cow_mvc_session.member.controller.dto.UpdateMemberRequest;
import cow.cow_mvc_session.member.entity.Member;
import cow.cow_mvc_session.member.service.MemberService;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/members")
@RequiredArgsConstructor
public class MemberController {

	private final MemberService memberService;

	@PostMapping("/new")
	public String create(@RequestBody final MemberRequest memberRequest) {
		memberService.join(memberRequest);
		return "회원저장 성공!";
	}

	// @PostMapping("/new")
	// public MemberResponse create(@RequestBody final MemberRequest memberRequest) {
	// 	return memberService.join(memberRequest);
	// }

	@GetMapping("/{memberId}")
	public String findMember(@PathVariable final Long memberId) {
		Member member = memberService.findOne(memberId);
		return "member 아이디: " + member.getId() + ", member 이름: " + member.getName();
	}

	@PatchMapping("/{memberId}")
	public String updateMember(@PathVariable final Long memberId, @RequestBody final UpdateMemberRequest updateMemberRequest) {
		memberService.updateMember(memberId, updateMemberRequest.getName());
		return "회원수정 완료!";
	}

	@DeleteMapping("/{memberId}")
	public String deleteMember(@PathVariable final Long memberId){
		memberService.deleteMember(memberId);
		return "멤버ID "+ memberId + " 삭제완료.";
	}
}

