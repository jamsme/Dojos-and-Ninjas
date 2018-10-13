package com.codingdojo.dojosNinjas.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.codingdojo.dojosNinjas.models.Dojo;
import com.codingdojo.dojosNinjas.models.Ninja;
import com.codingdojo.dojosNinjas.sevices.DojoService;
import com.codingdojo.dojosNinjas.sevices.NinjaService;

@Controller
public class NinjaController {
	
	private final NinjaService ninjaService;
	private final DojoService dojoService;
	
	public NinjaController(NinjaService ninjaService, DojoService dojoService) {
		this.ninjaService = ninjaService;
		this.dojoService = dojoService;
	}
	
	@RequestMapping("/showNinja")
	public String ninja(Model model, @ModelAttribute("ninja") Ninja ninja) {
		List<Dojo> dojos = dojoService.dojoAll();
		model.addAttribute("dojo", dojos);
		return "ninja.jsp";
	};
	
	@PostMapping("/ninja")
	public String create(@Valid @ModelAttribute("ninja") Ninja ninja, BindingResult result) {
		if (result.hasErrors()) {
			return "ninja.jsp";
		} else {
			ninjaService.createNinja(ninja);
			return "redirect:/" + ninja.getDojo().getId();
		}
	};
	
	@RequestMapping("/{id}")
	public String everyone(Model model, @PathVariable("id") Long id) {
		Dojo dojo = dojoService.oneDojo(id);
		model.addAttribute("ninjas", dojo.getNinjas());
		return "everyone.jsp";
	};

}
