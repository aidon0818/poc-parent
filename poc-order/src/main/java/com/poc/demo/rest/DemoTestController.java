package com.poc.demo.rest;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * ${DESCRIPTION}
 *
 * @author demo
 * @create 2017-10-22 20:30
 */
@RestController
@RequestMapping("test")
public class DemoTestController {

//	@Autowired
//	private RestTemplate restTemplate;

	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String getTest() {
		return "afdasdf1asd1f2sad1";
	}

	@RequestMapping(value = "/message/{id}", method = RequestMethod.GET)
	public List<String> getMsg(@PathVariable Long id) {
		return Arrays.asList("aaa", "bbb", "111");
	}

//	@RequestMapping(value = "/getProduct/{id}", method = RequestMethod.GET)
//	public String getProduct(@PathVariable String id) {
//		return restTemplate.getForObject(
//				"http://demo-service-consumer/test/getProduct/" + id,
//				String.class);
//	}

}