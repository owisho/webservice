package per.owisho.learn.webservice.impl;

import javax.jws.WebService;

import per.owisho.learn.webservice.inter.HelloWorld;

@WebService
public class HelloWorldService implements HelloWorld{

	public String sayhello() {
		return "hello world";
	}

	public String localmethod() {
		return "localmethod";
	}

}
