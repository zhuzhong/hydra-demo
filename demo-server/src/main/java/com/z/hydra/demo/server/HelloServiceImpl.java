/**
 * 
 */
package com.z.hydra.demo.server;

import com.z.hydra.demo.api.HelloService;

/**
 * @author sunff
 * 
 */
public class HelloServiceImpl implements HelloService {

	public String sayHello(String name) {

		return "hello " + name;
	}

}
