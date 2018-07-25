package com.cg.sessionschedule.beans;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.NotEmpty;
//Creation of beans
@Entity()
@Table(name="ScheduledSessions")
public class ScheduledSessions implements Serializable {
	private static final long serialVersionUID = 1L; 
	@NotEmpty
	private String name;
	@Id
	@NotEmpty
	private int id;
	private int duration;
	private String faculty;
	private String mode1;
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDuration() {
		return duration;
	}
	public void setDuration(int duration) {
		this.duration = duration;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	public String getMode1() {
		return mode1;
	}
	public void setMode1(String mode1) {
		this.mode1 = mode1;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ScheduledSessions other = (ScheduledSessions) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "ScheduledSessions [name=" + name + ", id=" + id + ", duration=" + duration + ", faculty=" + faculty
				+ ", mode1=" + mode1 + "]";
	}
	public ScheduledSessions() {
		super();
	
	}
	public ScheduledSessions(String name, int id, int duration, String faculty, String mode1) {
		super();
		this.name = name;
		this.id = id;
		this.duration = duration;
		this.faculty = faculty;
		this.mode1 = mode1;
	}
	
	
	
	
	
	
	
	
}
