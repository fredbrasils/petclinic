package br.com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetController {

	@RequestMapping({"/vet","/vets","/vet/index","/vet/index.html","/vets/index","/vets/index.html"})
	public String index() {
		return "vet/index";
	}
}
