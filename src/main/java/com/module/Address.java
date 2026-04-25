package com.module;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component	
public class Address {
	
	@Value("${village}")
	String village;
	
	@Value("${zipCode}")
	int zipCode;
	
	public Address(){
		
	}
	
	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public Address(String village, int zipCode) {
		super();
		this.village = village;
		this.zipCode = zipCode;
	}

	public String getVillage() {
		return village;
	}

	public void setVillage(String village) {
		this.village = village;
	}
	
	@Override
	public String toString() {
		return "Address [village=" + village + ", zipCode=" + zipCode + "]";
	}


}
