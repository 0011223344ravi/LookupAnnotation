package com.example.lookupannotation;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.junit.Assert;

@SpringBootTest
class LookupAnnotationApplicationTests {
	@Autowired
	private ApplicationContext applicationContext;
	@Test
	void contextLoads() {
	}


	@Test
	void singleBeanScopeTest() {

       UserService service1 = applicationContext.getBean(UserService.class);
		UserService service2= applicationContext.getBean(UserService.class);
		Assert.assertEquals(service1.hashCode(),service2.hashCode());

	}

	@Test
	void prototypeBeanScopeTest() {
  WeatherService weatherService1 = applicationContext.getBean(WeatherService.class);
  WeatherService weatherService2= applicationContext.getBean(WeatherService.class);

  Assert.assertNotEquals(weatherService1.hashCode(),weatherService2.hashCode());
	}


}
