package com.nico.jenkins;

import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class HelloWorldServiceImplTest {

	@Test
	public void testSayHello() {
		assertEquals("Hello World", new HelloWorldServiceImpl().sayHello());
	}
	
}