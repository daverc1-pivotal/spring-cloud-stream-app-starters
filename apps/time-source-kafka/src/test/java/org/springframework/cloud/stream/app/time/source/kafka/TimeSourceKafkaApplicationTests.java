package org.springframework.cloud.stream.app.time.source.kafka;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = TimeSourceKafkaApplication.class)
public class TimeSourceKafkaApplicationTests {

	@Test
	public void contextLoads() {
	}

}