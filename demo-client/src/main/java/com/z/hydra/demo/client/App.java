package com.z.hydra.demo.client;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.z.hydra.demo.api.HelloService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
     
        ClassPathXmlApplicationContext context=
        		new ClassPathXmlApplicationContext("/META-INF/spring/client.xml");
        context.start();
        HelloService h=context.getBean("helloService", HelloService.class);
        String r=h.sayHello("zhuzhong");
        System.out.println(r);
        		
        
        
        
    }
}
