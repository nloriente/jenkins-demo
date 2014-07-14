package com.nico.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloWorldControllerTest {

	@Test
	public void testSayHello() {
		assertEquals("Hello World of Jenkins!", new HelloWorldController().sayHello());
	}
	
}
