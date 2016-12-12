package com.nixsolution.usermanagment;

import java.util.Calendar;
import java.util.Date;

public class User {
 private Long id;
 private String firstName;
 private String lastname;
 private Date dateOfBirth;
public User(String firstName, String lastName, Date date) {
	this.firstName=firstName;
	this.lastname=lastName;
	this.dateOfBirth=date;
}
public User(Long id, String firstName, String lastName, Date date) {
	this.id=id;
	this.firstName=firstName;
	this.lastname=lastName;
	this.dateOfBirth=date;
}
public User() {
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Date getDateOfBirth() {
	return dateOfBirth;
}
public void setDateOfBirth(Date dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}
public Object getFullName() {
	
	return getLastname() +", " + getFirstName() ;
}
public Object getAge() {
	 Calendar calendar = Calendar.getInstance();
     calendar.setTime(new Date());
     int currentYear = calendar.get(Calendar.YEAR);
     calendar.setTime(getDateOfBirth());
     int year = calendar.get(Calendar.YEAR);
     return currentYear - year;
}

public boolean equals(Object obj) {
	if(obj == null) {
		return false;
	}
	if(this == obj){
		return true;
	}
	if(this.getId() == null && ((User) obj).getId() == null){
		return true;
	}
	return this.getId().equals(((User) obj).getId());
}

public int hashCode() {
	if(this.getId() == null){
		return 0;
	}
	return this.getId().hashCode();
} 
}
