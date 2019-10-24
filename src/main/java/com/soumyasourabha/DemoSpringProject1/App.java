package com.soumyasourabha.DemoSpringProject1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context =  new ClassPathXmlApplicationContext("beans.xml");
       
       coder coder = (coder)context.getBean("coder");
       
       coder.coding();
       
       trainer trainer =  context.getBean("trainer",trainer.class);
       
       trainer.training();
      
    }
}
