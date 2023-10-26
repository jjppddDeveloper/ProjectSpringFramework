package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Sample;
import com.example.demo.form.SampleForm;
import com.example.demo.service.SampleService;

@RequestMapping("/sample")
@Controller
public class SampleController {

	@Autowired
	SampleService service;

	@ModelAttribute
	public SampleForm setUpForm() {
		SampleForm form = new SampleForm();
		form.setGender(0);
		return form;
	}

	@GetMapping
	public String ShowList(SampleForm sampleForm, Model model) {
		Iterable<Sample> sample = service.SelectAll();
		model.addAttribute("list", sample);
		return "show.html";
	}
}