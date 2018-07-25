package com.cg.sessionschedule.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.sessionschedule.beans.ScheduledSessions;



public interface ITrainingDAO extends JpaRepository<ScheduledSessions, Integer>{

}
