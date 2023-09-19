package apirest.dto;

public class User {
	
	private String name;
	private Integer age;
	private Long id;
	
	public User(String name, Integer age) {
		this.name = name;
		this.age = age;
	}
	
	public User(String name) {
		this.name = name;
	}
	
	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
