package com.feedback.dao;

import org.springframework.beans.factory.annotation.Autowired;
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import com.feedback.entity.Feedback;

@Component
public class FeedbackDao 
{
	@Autowired
	FeedbackRepo repo;
	public void addFeedback(Feedback fed) 
	{
		repo.save(fed);
		System.out.print("Hello"+fed);
	}
}
