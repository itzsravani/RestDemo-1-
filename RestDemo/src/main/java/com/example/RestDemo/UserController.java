package com.example.RestDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	String display="";
 
 @GetMapping("/sravani/welcome/{name}")
 public String welcomeUser(@PathVariable String name) {
	return "welcome :"+name;
	
 }
 @GetMapping("/sravani/square/{num}")
 public String getSquareOfNumber(@PathVariable int num) {
	return "Square of given number is:"+num*num;
	
 }
 @GetMapping("/sravani/user/{name}")
 public String displayUserDetails(@PathVariable String name,@RequestParam String tech,@RequestParam String role) {
	return name+" : "+tech+" "+role;
	
 }
 
 
}


