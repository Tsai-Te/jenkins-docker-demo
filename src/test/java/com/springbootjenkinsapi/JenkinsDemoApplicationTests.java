package com.springbootjenkinsapi;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
@Slf4j
class JenkinsDemoApplicationTests {

	@Test
	public void contextLoads() {
		log.info("Test case executing...");
		log.info("Pipeline testing...");
		assert(true);
	}

}
