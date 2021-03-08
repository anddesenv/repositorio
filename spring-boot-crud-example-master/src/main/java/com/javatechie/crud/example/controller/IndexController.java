package com.javatechie.crud.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/pri")
	public String index(){
		return "index";
	}
}