package com.nixsolutions.usermanagment;

import java.util.Calendar;
import java.util.Date;

import com.nixsolutions.usermanagment.User;

import junit.framework.TestCase;

public class UserTest extends TestCase {

    private User user;
	private Date dateOfBirthday;

    
    protected void setUp() throws Exception {
        super.setUp();
        user = new User();
        
       Calendar calendar = Calendar.getInstance();
       calendar.set(1997, Calendar.SEPTEMBER, 01);
       dateOfBirthday = calendar.getTime();
        
    }

    
    public void testGetFullName() {
        user.setFirstName("Анатолій");
        user.setLastName("Городовенко");
        assertEquals("Городовенко, Анатолій", user.getFullName());
    }
    
    
    public void testGetAge() {
       
        user.setDateOfBirthday(dateOfBirthday);
        assertEquals(2016 - 1997, user.getAge());
        
    }

}
