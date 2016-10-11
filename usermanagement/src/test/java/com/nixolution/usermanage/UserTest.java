package com.nixolution.usermanage; 

import java.util.Calendar; 
import java.util.Date; 

import junit.framework.TestCase; 

public class UserTest extends TestCase { 

private User user; 
private Date dateOfBirthd; 

protected void setUp() throws Exception { 
super.setUp(); 
user = new User(); 

Calendar calendar = Calendar.getInstance(); 
calendar.set(1997, Calendar.SEPTEMBER, 01); 
dateOfBirthd = calendar.getTime(); 
} 

public void testGetFullName() { 
user.setFirstName("Anatolii"); 
user.setLastName("Horodovenko"); 
assertEquals("Horodovenko, Anatolii", user.getFullName()); 
} 

public void testGetAge() { 
user.setDateOfBirthd(dateOfBirthd); 
assertEquals(2016 - 1997, user.getAge()); 
} 
}