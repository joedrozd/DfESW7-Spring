package com.qa.user_app.data.entity;

import java.util.Objects;

public class User {

	private Long id;
	private String forename;
	private String surname;
	private Integer age;

	public User() {
		super();
	}

	public User(String forename, String surname, int age) {
		super();
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}

	public User(long id, String forename, String surname, int age) {
		super();
		this.id = id;
		this.forename = forename;
		this.surname = surname;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", forename=" + forename + ", surname=" + surname + ", age=" + age + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(age, forename, id, surname);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(age, other.age) && Objects.equals(forename, other.forename)
				&& Objects.equals(id, other.id) && Objects.equals(surname, other.surname);
	}

	
}
