package com.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class MyContrpllers 
{
	
@GetMapping("First")	
public String First()
{
	return "First";
}

}
