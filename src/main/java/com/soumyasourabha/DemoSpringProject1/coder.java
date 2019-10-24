package com.soumyasourabha.DemoSpringProject1;

public class coder {
	
	private String name;
	private system system;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public system getSystem() {
		return system;
	}

	public void setSystem(system system) {
		this.system = system;
	}
	
	public void coding() {
		
		system.processor();
	}
	
}
