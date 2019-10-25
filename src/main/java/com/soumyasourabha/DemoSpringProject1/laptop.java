package com.soumyasourabha.DemoSpringProject1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class laptop implements system{
	
	@Value("${laptop.id}")
	private int id;
	@Value("${laptop.brand}")
	private String brand;
	
	public void processor() {
		
		System.out.println("ios");
	}

}
