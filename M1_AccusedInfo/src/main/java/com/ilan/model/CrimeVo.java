package com.ilan.model;

import java.util.Date;

import io.swagger.annotations.ApiModel;


@ApiModel
public class CrimeVo {
	
	
	private String accusedName;
	
	private String crime;
	
	private int crimeCount;
	
	private Date arrestedOn;
	
	public CrimeVo(){}
	
	public CrimeVo(String accusedName, String crime, int crimeCount, Date arrestedOn){
		this.accusedName=accusedName;
		this.crime=crime;
		this.crimeCount=crimeCount;
		this.arrestedOn=arrestedOn;
	}
	
	
	
	public String getAccusedName() {
		return accusedName;
	}
	public void setAccusedName(String accusedName) {
		this.accusedName = accusedName;
	}
	public Date getArrestedOn() {
		return arrestedOn;
	}
	public void setArrestedOn(Date arrestedOn) {
		this.arrestedOn = arrestedOn;
	}
	public String getCrime() {
		return crime;
	}
	public void setCrime(String crime) {
		this.crime = crime;
	}

	public int getCrimeCount() {
		return crimeCount;
	}

	public void setCrimeCount(int crimeCount) {
		this.crimeCount = crimeCount;
	}
	
	
	
	
}