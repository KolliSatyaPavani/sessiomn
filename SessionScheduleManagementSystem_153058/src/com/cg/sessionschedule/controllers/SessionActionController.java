package com.cg.sessionschedule.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import com.cg.sessionschedule.beans.ScheduledSessions;
import com.cg.sessionschedule.exception.SessionDetailsNotFoundException;
import com.cg.sessionschedule.service.ITrainingService;
@Controller
public class SessionActionController {
	public static int id;
	@Autowired
	ITrainingService sessionServices;
	/*@RequestMapping(value="/sessions")
	public String getLoginPage() {
		return "ScheduledSessions";
	}*/
	@RequestMapping(value="/sessions")
	public ModelAndView getSessiondetailslist() { 
		try {
		List<ScheduledSessions> sessions = sessionServices.getAllSessions();
		return new ModelAndView("ScheduledSessions","session",sessions);
	}catch(SessionDetailsNotFoundException e) {
		return new ModelAndView("indexPage", "errorMessage", e.getMessage());
	}
	}	
	@RequestMapping(value="/enrollAction")
	public ModelAndView getSessiondetails(@ModelAttribute("session")ScheduledSessions session, @RequestParam("id")int Id) { 
	 try {
		session = sessionServices.showSession(Id);
		return new ModelAndView("Success","session",session);
	}catch(SessionDetailsNotFoundException e) {
		return new ModelAndView("indexPage", "errorMessage", e.getMessage());
	}}
	
	
}
