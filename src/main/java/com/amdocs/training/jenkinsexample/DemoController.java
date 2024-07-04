package com.amdocs.training.jenkinsexample;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/show")
	public String show() {
		return "welcome to jenkin session";
	}
}
