package com.cg.sessionschedule.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


import com.cg.sessionschedule.DAO.ITrainingDAO;
import com.cg.sessionschedule.beans.ScheduledSessions;
import com.cg.sessionschedule.exception.SessionDetailsNotFoundException;

@Component(value="sessionService")
public class TrainingServiceImpl implements ITrainingService {
	@Autowired
	private ITrainingDAO repo;
	ScheduledSessions session;
	public TrainingServiceImpl() {
	}
@Override
	public List<ScheduledSessions> getAllSessions() {
		
	List<ScheduledSessions> sessions = repo.findAll();
	if(repo!=null) {
	return sessions;
	}
	else
		throw new SessionDetailsNotFoundException("Session Details not found");
}
@Override
public ScheduledSessions showSession(int id) {
session=repo.findOne(id);
	if(session!=null)
		return session;
	else
		throw new SessionDetailsNotFoundException("Session Details not found");
}
}
