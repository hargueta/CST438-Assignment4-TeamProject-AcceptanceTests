package com.movie.me;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class WelcomeEndpoint {
	
	@RequestMapping("/rest")
	public Object greeting() {
		Map<String, String> returnMap = new HashMap<String, String>();
		
		returnMap.put("first", "hello");
		returnMap.put("second", "world");
		return returnMap;
	}
	
	@RequestMapping(value="/greet", method=RequestMethod.POST)
	public String greet(@PathVariable("{name}") String name) {
		return "Hello" + name;
	}
}
