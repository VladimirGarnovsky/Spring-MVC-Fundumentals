package com.vova.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vova.model.Exercise;

@Controller
public class MinutesController {

	@RequestMapping(value="/addMinutes")
	public String addminutes(@ModelAttribute("exercise") Exercise exercise) {
		
		System.out.println("exercise:"+exercise.getMinutes());
		return "addMinutes";
	}

}
