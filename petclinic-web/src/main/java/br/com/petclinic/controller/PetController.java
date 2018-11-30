package br.com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PetController {

	@RequestMapping({"/pet","/pets","/pet/index","/pet/index.html","/pets/index","/pets/index.html"})
	public String index() {
		return "pet/index";
	}
}
