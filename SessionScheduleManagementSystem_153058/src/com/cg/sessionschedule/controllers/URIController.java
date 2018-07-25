package com.cg.sessionschedule.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.sessionschedule.beans.ScheduledSessions;

@Controller
public class URIController {
	@RequestMapping(value="/")
	public String getIndexPage() {
		return "indexPage";
	}
	@ModelAttribute("session")
	public ScheduledSessions getSession() {
		return new ScheduledSessions();
	}
	@RequestMapping(value="enroll")
	public String getEnrollPage() {
		return "Enrollment";
	}
	
	
	
	
}
