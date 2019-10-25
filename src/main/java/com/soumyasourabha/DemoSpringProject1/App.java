package com.soumyasourabha.DemoSpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =  new AnnotationConfigApplicationContext(config.class);
       
       coder coder = (coder)context.getBean("coder");
       
       coder.coding();
       
       trainer trainer = (trainer)context.getBean("trainer");
       
       trainer.training();
       
       System.out.println(coder);
       
       System.out.println(trainer);
      
    }
}
