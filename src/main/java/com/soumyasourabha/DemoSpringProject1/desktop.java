package com.soumyasourabha.DemoSpringProject1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class desktop implements system {
	
	@Value("${desktop.id}")
	private int id;
	@Value("${desktop.brand}")
	private String brand;

	public void processor() {
		System.out.println("intel");
	}
	
}
