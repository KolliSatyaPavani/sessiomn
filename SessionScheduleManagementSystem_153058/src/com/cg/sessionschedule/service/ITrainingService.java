package com.cg.sessionschedule.service;

import java.util.List;

import com.cg.sessionschedule.beans.ScheduledSessions;



public interface ITrainingService {
	public List<ScheduledSessions> getAllSessions();
	public ScheduledSessions showSession(int id); 
	
	
}
