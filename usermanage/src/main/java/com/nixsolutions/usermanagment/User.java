package com.nixsolutions.usermanagment;

import java.util.Calendar;
import java.util.Date;

public class User {
 private Long id;
 private String firstName;
 private String lastname;
 private Date dateOfBirth;
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
 
}
