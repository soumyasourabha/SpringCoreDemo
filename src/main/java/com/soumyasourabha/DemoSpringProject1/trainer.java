package com.soumyasourabha.DemoSpringProject1;

public class trainer {
	
	private String name;
	private system system;
	
	public trainer(String name, com.soumyasourabha.DemoSpringProject1.system system) {
		super();
		this.name = name;
		this.system = system;
	}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public system getSystem() {
//		return system;
//	}
//
//	public void setSystem(system system) {
//		this.system = system;
//	}
	
	public void training() {
		system.processor();
	}
}
