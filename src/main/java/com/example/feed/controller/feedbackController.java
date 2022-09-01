package com.example.feed.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.feed.entities.Feedback;
import com.example.feed.service.FeedbackService;

@Controller
public class feedbackController {

	@Autowired
	FeedbackService feedbackService;
	
	
	@RequestMapping("/index")
	public String feedback() {
		return "index";
	}

	@PostMapping("/index/add")
	public String addNewFeedback(@ModelAttribute Feedback fb, ModelMap m) {
		System.out.println(fb);
		Feedback newFb = new Feedback(fb.getRating(), fb.getFeed(), fb.getUsername());
	
		feedbackService.addNewFeedback(newFb);
		m.addAttribute("userFeed", fb);
		return "feedback";

	}
}
