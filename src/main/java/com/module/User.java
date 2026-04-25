package com.module;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	
	@Value("${name}")
	String name;
	
	@Value("${id}")
	int id;
	
	
	@Autowired
	Address address;

	public User(String name, int id, Address address) {
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}


	public User() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", address=" + address + "]";
	}

}
