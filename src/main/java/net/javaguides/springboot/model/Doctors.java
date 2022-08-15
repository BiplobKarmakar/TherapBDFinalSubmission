package net.javaguides.springboot.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Doctors {
	@javax.persistence.Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long Id;
	private String name;
	private String degree;
	private String specialization;
	private String lasteduinstitution;
	private String chamberAddress;
	private String district;
	public Doctors() {
		super();
	}
	public Doctors(String name, String degree, String specialization, String lasteduinstitution, String chamberAddress,
			String district) {
		super();
		this.name = name;
		this.degree = degree;
		this.specialization = specialization;
		this.lasteduinstitution = lasteduinstitution;
		this.chamberAddress = chamberAddress;
		this.district = district;
	}
	public long getId() {
		return Id;
	}
	public void setId(long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDegree() {
		return degree;
	}
	public void setDegree(String degree) {
		this.degree = degree;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public String getLasteduinstitution() {
		return lasteduinstitution;
	}
	public void setLasteduinstitution(String lasteduinstitution) {
		this.lasteduinstitution = lasteduinstitution;
	}
	public String getChamberAddress() {
		return chamberAddress;
	}
	public void setChamberAddress(String chamberAddress) {
		this.chamberAddress = chamberAddress;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	@Override
	public String toString() {
		return "Doctors [Id=" + Id + ", name=" + name + ", degree=" + degree + ", specialization=" + specialization
				+ ", lasteduinstitution=" + lasteduinstitution + ", chamberAddress=" + chamberAddress + ", district="
				+ district + "]";
	}
	
	

}
