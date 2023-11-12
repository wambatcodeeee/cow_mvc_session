package cow.cow_mvc_session.member.entity;

public class Member {
	private Long id;
	private String name;

	public Member(final Long id, final String name) {
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name){
		this.name = name;
	}
}
