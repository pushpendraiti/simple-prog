package com.java;

import java.util.ArrayList;
import java.util.List;

public class EmployeeAnyMatch {

	private Integer eId;
	private String eName;
	private Integer eAge;
	private String eCity;

	public EmployeeAnyMatch() {

	}

	public EmployeeAnyMatch(Integer eId, String eName, Integer eAge, String eCity) {
		this.eId = eId;
		this.eName = eName;
		this.eAge = eAge;
		this.eCity = eCity;
	}

	public Integer geteId() {
		return eId;
	}

	public void seteId(Integer eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Integer geteAge() {
		return eAge;
	}

	public void seteAge(Integer eAge) {
		this.eAge = eAge;
	}

	public String geteCity() {
		return eCity;
	}

	public void seteCity(String eCity) {
		this.eCity = eCity;
	}

	@Override
	public String toString() {
		return "EmployeeAnyMatch [eId=" + eId + ", eName=" + eName + ", eAge=" + eAge + ", eCity=" + eCity + "]";
	}

	public static List<EmployeeAnyMatch> getEmployee() {
		List<EmployeeAnyMatch> list = new ArrayList<>();
		list.add(new EmployeeAnyMatch(101, "Aman", 28, "Moradabad"));
		list.add(new EmployeeAnyMatch(102, "Kavita", 32, "Rampur"));
		list.add(new EmployeeAnyMatch(103, "Kamal", 29, "Chandausi"));
		list.add(new EmployeeAnyMatch(104, "Vijay", 26, "Delhi"));
		return list;
	}
}
