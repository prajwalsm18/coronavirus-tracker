package com.prajwal.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.prajwal.springboot.services.CoronaVirusDataService;

@Controller
@Configuration
public class HomeController {

	@Autowired
	private CoronaVirusDataService coronaVirusDataService;

	@GetMapping("/")
	public String home(Model model) {
		model.addAttribute("stats", coronaVirusDataService.getAllstats());
		return "index";
	}
	
}
