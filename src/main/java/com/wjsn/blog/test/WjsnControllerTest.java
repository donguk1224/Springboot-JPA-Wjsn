package com.wjsn.blog.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WjsnControllerTest {
	
	//http://localhost:8080/test/love
	@GetMapping("/test/love")
	public String love() {
		return "<h1>우주소녀 사랑해</h1>";
	}
}