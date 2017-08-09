package com.z.hydra.demo.server;

import java.io.IOException;

import com.alibaba.dubbo.container.Main;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws IOException
    {
        System.out.println( "Hello World!" );
        
        //Main m=new Main();
       // String[] args=null
        Main.main(args);
        System.out.println("ooook");
        
        System.in.read(); // 为保证服务一直开着，利用输入流的阻塞来模拟  
    }
}
