package com.jtest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.jtest.controller.jtestController;

@SpringBootTest
class JtestApplicationTests {
@Autowired
jtestController j;
	@Test
	void contextLoads() {
	assertNotNull(j);
	}
	public void testCase() {
		assertNotNull(j.getMsg());
		assertEquals(j.getMsg(), "hi");
		
	}

}
