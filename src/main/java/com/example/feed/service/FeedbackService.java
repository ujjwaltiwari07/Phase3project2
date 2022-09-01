package com.example.feed.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.feed.entities.Feedback;
import com.example.feed.repository.FeedbackRepository;

@Service
public class FeedbackService {
	@Autowired
	
	FeedbackRepository feedbackRepository;

	public Iterable<Feedback> GetAllFeedback() {
		return feedbackRepository.findAll();
	}
	public Feedback addNewFeedback(Feedback fb) {
		return feedbackRepository.save(fb);
	}

}