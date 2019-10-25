package com.soumyasourabha.DemoSpringProject1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class trainer {
	
	@Value("${trainer.name}")
	private String name;
	@Autowired
	@Qualifier("desktop")
	private system system;

	public void training() {
		system.processor();
	}

	@Override
	public String toString() {
		return "trainer [name=" + name + "]";
	}
}
