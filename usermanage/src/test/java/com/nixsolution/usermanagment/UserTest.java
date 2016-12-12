package com.nixsolution.usermanagment;

import java.util.Calendar;
import java.util.Date;

import junit.framework.TestCase; 

public class UserTest extends TestCase { 

private User user;
private Date dateOfBirth;


protected void setUp() throws Exception { 
super.setUp(); 
user = new User(); 
Calendar calendar = Calendar.getInstance();
calendar.set(1997, Calendar.SEPTEMBER, 01);
dateOfBirth = calendar.getTime();
} 


public void testGetFullName() { 
user.setFirstName("Анатолий"); 
user.setLastname("Городовенко"); 
assertEquals("Городовенко, Анатолий", user.getFullName()); 
} 
public void testGetAge() {
    user.setDateOfBirth(dateOfBirth);
    assertEquals(2016 - 1997, user.getAge());
}


}
