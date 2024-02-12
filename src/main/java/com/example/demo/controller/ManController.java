package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.model.Man;
import com.example.demo.repository.ManRepo;

@Controller
public class ManController {
	@Autowired
	ManRepo repo;
	
	@GetMapping("/")
	public String home() {
		return "home.jsp";
	}
	@PostMapping("/addMan")
	public String addman(Man man) {
		repo.save(man);
		return "home.jsp";
	}
	@GetMapping("/fetchMan")
	public ModelAndView fetch(@RequestParam int aid) {
		ModelAndView mv=new ModelAndView("fetch.jsp");
		Man man=repo.findById(aid).orElse(null);
//		System.out.println(repo.findByAname("sai"));
//		System.out.println(repo.findByAidGreaterThan(1));
		System.out.println("java people "+ repo.findByAtechSorting("java"));
		System.out.println("sql people "+ repo.findByAtechSorting("sql"));
		System.out.println("go people "+ repo.findByAtechSorting("go"));
		mv.addObject(man);
		return mv;
	}
}
