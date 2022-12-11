package com.example.crud.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class hellowWordController {
    @RequestMapping({ "/hello" })
	public String firstPage(Principal principal) {
		return "Hello World "+principal.getName();
	}

}
