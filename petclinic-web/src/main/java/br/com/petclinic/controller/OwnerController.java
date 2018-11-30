package br.com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/owner","/owners"})
@Controller
public class OwnerController {

	@RequestMapping({"/","","/index","/index.html","/index","/index.html"})
	public String index() {
		return "owner/index";
	}
}
