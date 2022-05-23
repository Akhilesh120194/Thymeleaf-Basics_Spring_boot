package com.example.demo.controllers;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.GetMapping;

/*
  JSP file need JSTL and JSTL need jsaper to compile. JSP file eed web server web container to run .
  JSP file cannot run individually without a web server .
  
  Thymeleaf things can be packaged in to executable jar and it donot require external web server 
  to run the particular jar file 
  
  JSP will not work with a executable jar ,we need to create war file for that and we need 
  to deploy war file individual in the web server .
  
  In case of JSP war file create .Whenever we package the application conatining jsp ,
  the moment we deploy this application ,jsps will be converted into .class files and that 
  will be loaded by tomcat or to the server we are deploying application in to it . 
  
  In case of jsp application we need to configure the prefix and suffix for resolving the path .
  Spring application donot support JSP by default .We need to add "tomcat jasper" dependency 
  explicitly. 
 */
@Controller
public class HelloController {

	@GetMapping("/")
	public String showHelloPage()
	{
		return "hello";
		
	}
}
