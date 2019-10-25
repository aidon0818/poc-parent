package com.poc.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.poc.demo.service.TestService;

/**
 * @author test
 */
@RestController
@RequestMapping("test")
public class TestConrtroller  {

//	@Autowired
//    private RestTemplate restTemplate;
	
	@Autowired
	private TestService testService;
	
    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public String getTest() {
    	
//        return restTemplate.getForObject("http://demo-service-provider/test/test", String.class);
    	
    	return testService.test();
    }

    @RequestMapping(value = "/message/{id}", method = RequestMethod.GET)
    public List<String> getMsg(@PathVariable Long id) {
    	return null;
    }
}