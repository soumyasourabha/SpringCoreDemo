package com.soumyasourabha.DemoSpringProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class coder {
	
	@Value("${coder.name}")
	private String name;
	@Autowired
	@Qualifier("laptop")
	private system system;
	
	public void coding() {
		system.processor();
	}

	@Override
	public String toString() {
		return "coder [name=" + name + "]";
	}
	
}
