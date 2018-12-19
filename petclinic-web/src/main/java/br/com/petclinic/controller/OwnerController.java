package br.com.petclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.petclinic.service.OwnerService;

@RequestMapping({"/owner","/owners"})
@Controller
public class OwnerController {

	private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }
    
	@RequestMapping({"/","","/index","/index.html","/index","/index.html"})
	public String index(Model model) {
		model.addAttribute("owners", ownerService.findAll());
		return "owner/index";
	}
}
