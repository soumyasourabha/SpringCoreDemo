package com.soumyasourabha.DemoSpringProject1;

public class laptop implements system{
	
	private int id;
	private String brand;
	
	public void setId(int id) {
		this.id = id;
	}
	public void getId() {
		System.out.println("laptopId :"+id);
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void getBrand() {
		System.out.println("laptopBrand :"+brand);
	}

	public void processor() {
		
		System.out.println("ios");
	}

}
