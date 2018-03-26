package com.solo;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class TakeoutApplicationTests {

	private final Logger logger = LoggerFactory.getLogger(TakeoutApplicationTests.class);

	@Test
	public void contextLoads() {
		String name = "haha";
		String password = "123456";

		logger.debug("debug---");
		logger.info("info---");
		logger.error("error---");
		logger.info("name:{}, password:{}", name, password);



	}

}
