package dev.techverito.testproject.model;

import java.util.Objects;

public class Address {
	int id;
	int empid;
	String city;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Address(int id, int empid, String city) {
		super();
		this.id = id;
		this.empid = empid;
		this.city = city;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(city, empid, id);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && empid == other.empid && id == other.id;
	}
	
	
	
}
