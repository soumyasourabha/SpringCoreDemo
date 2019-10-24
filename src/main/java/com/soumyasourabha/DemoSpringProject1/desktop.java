package com.soumyasourabha.DemoSpringProject1;

public class desktop implements system {
	
	private int id;
	private String brand;
	
	public void setId(int id) {
		this.id = id;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public void getBrand() {
		System.out.println("Deskto Brand :"+brand);
	}
	
	public void getId() {
		System.out.println("Desktop id:"+id);
	}
	
	public void processor() {
		System.out.println("intel");
	}
	
}
