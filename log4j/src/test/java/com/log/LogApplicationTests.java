package com.log;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.log.controller.logController;

@SpringBootTest
class LogApplicationTests {
	@Autowired
	logController lc;

	@Test
	void contextLoads() {
	}
	@Test
	public void testCase() {
		assertNot(lc.getmsg(),"Hi welcome");
	}

}
