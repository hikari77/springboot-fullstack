package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void contextLoads() {
		Assertions.fail(" oh no ,,,  test failed.");
		Assertions.fail(" oh no ,,,  test failed again - - - .");
	}

}
