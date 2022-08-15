package net.javaguides.springboot.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Patients {
	    @Id
	   @GeneratedValue(strategy=GenerationType.AUTO)
	    private Long id;
	    private String name;
	
	private String email;
	
	private String maritalStatus;
	private String mobilenumber;
	
	
	private String gender;
	
	private String note;
	// private boolean married 
	
	   private int  age;
	   private String profession;
	   private String homeDistrict;
	
	public Patients() {
		super();
	}

	public Patients(Long id, String name, String email, String maritalStatus, String mobilenumber, String gender,
			String note, int age, String profession, String homeDistrict) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.maritalStatus = maritalStatus;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.note = note;
		this.age = age;
		this.profession = profession;
		this.homeDistrict = homeDistrict;
	}

	public Patients(String name, String email, String maritalStatus, String mobilenumber, String gender, String note,
			int age, String profession, String homeDistrict) {
		super();
		this.name = name;
		this.email = email;
		this.maritalStatus = maritalStatus;
		this.mobilenumber = mobilenumber;
		this.gender = gender;
		this.note = note;
		this.age = age;
		this.profession = profession;
		this.homeDistrict = homeDistrict;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMaritalStatus() {
		return maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMobilenumber() {
		return mobilenumber;
	}

	public void setMobilenumber(String mobilenumber) {
		this.mobilenumber = mobilenumber;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getHomeDistrict() {
		return homeDistrict;
	}

	public void setHomeDistrict(String homeDistrict) {
		this.homeDistrict = homeDistrict;
	}

	@Override
	public String toString() {
		return "Patients [id=" + id + ", name=" + name + ", email=" + email + ", maritalStatus=" + maritalStatus
				+ ", mobilenumber=" + mobilenumber + ", gender=" + gender + ", note=" + note + ", Age=" + age
				+ ", profession=" + profession + ", homeDistrict=" + homeDistrict + "]";
	}
	
	
	

	

}
