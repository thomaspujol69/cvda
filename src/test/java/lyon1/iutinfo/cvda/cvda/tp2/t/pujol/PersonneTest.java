/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lyon1.iutinfo.cvda.cvda.tp2.t.pujol;

import java.util.GregorianCalendar;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author tpujo
 */
public class PersonneTest {
    
    public PersonneTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getLastName method, of class Person.
     */
    @Test
    public void testGetLastName() {
        System.out.println("getLastName");
        Person instance = new Person();
        instance.setLastName("Ljubičić");
        String expResult = "LJUBIČIĆ";
        String result = instance.getLastName();
        assertEquals(expResult, result);
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastNameEmpty() {
        System.out.println("setLastNameEmpty");
        String lastName = "";
        String expResult = "";
        Person instance = new Person();
        instance.setLastName(lastName);
        assertEquals(expResult, instance.getLastName());
    }

    /**
     * Test of setLastName method, of class Person.
     */
    @Test
    public void testSetLastName() {
        System.out.println("setLastName");
        String lastName = "petiT-robErt- ";
        String expResult = "PETIT-ROBERT";
        Person instance = new Person();
        instance.setLastName(lastName);
        assertEquals(expResult, instance.getLastName());
    }

    /**
     * Test of getFirstName method, of class Person.
     */
    @Test
    public void testGetFirstName() {
        System.out.println("getLastName");
        Person instance = new Person();
        String expResult = "";
        String result = instance.getFirstName();
        assertEquals(expResult, result);
    }

    /**
     * Test of getEmail method, of class Person.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Person instance = new Person();
        instance.setEmail("test@example.com");
        String expResult = "test@example.com";
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of setEmail method, of class Person.
     */
    @Test
    public void testSetEmail() {
        System.out.println("getEmail");
        Person instance = new Person();
        String m ="test@example.com";
        instance.setEmail(m);
        String expResult = m;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }
    /**
     * Test of setEmail method, of class Person.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testSetEmailIllegal() {
        System.out.println("getEmail");
        Person instance = new Person();
        String m ="test@exam@ple.com";
        instance.setEmail(m);
        String expResult = m;
        String result = instance.getEmail();
        assertEquals(expResult, result);
    }

    /**
     * Test of cleanUpString method, of class Person.
     */
    @Test
    public void testCleanUpString() {
        System.out.println("cleanUpString");
        String str = " TEST--  ";
        Person instance = new Person();
        String expResult = "TEST";
        String result = instance.cleanUpString(str);
        assertEquals(expResult, result);
    }
    
    /**
     * Test of trimWithDash method, of class Person.
     */
    @Test
    public void testTrimWithDash() {
        System.out.println("trimWithDash");
        String str = "--TEST-";
        Person instance = new Person();
        String expResult = "TEST";
        String result = instance.trimWithDash(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of toPascalCase method, of class Person.
     */
    @Test
    public void testToPascalCase() {
        System.out.println("toPascalCase");
        String str = "jean-reNé-bernard- ";
        Person instance = new Person();
        String expResult = "Jean-René-Bernard";
        String result = instance.toPascalCase(str);
        assertEquals(expResult, result);
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstName() {
        System.out.println("setFirstName");
        String firstName = "jeAn-REné ";
        String expResult="Jean-René";
        Person instance = new Person();
        instance.setFirstName(firstName); 
        assertEquals(expResult, instance.getFirstName());
    }

    /**
     * Test of setFirstName method, of class Person.
     */
    @Test
    public void testSetFirstNameVide() {
        System.out.println("setFirstNameVide");
        String firstName = "";
        String expResult="";
        Person instance = new Person();
        instance.setFirstName(firstName); 
        assertEquals(expResult, instance.getFirstName());
    }

    /**
     * Test of getBDate method, of class Person.
     */
    @Test
    public void testGetBDate() {
        System.out.println("getBDate");
        int y = 2021;
        int m = 01;
        int d = 01;
        GregorianCalendar expResult=new GregorianCalendar(y, m, d);
        Person instance = new Person();
        instance.setBDate(y, m, d);
        GregorianCalendar result = instance.getBDate();
        assertEquals(expResult, result);
    }

    /**
     * Test of setBDate method, of class Person.
     */
    @Test
    public void testSetBDate() {
        System.out.println("setBDate");
        int y = 2021;
        int m = 01;
        int d = 01;
        GregorianCalendar expResult=new GregorianCalendar(y, m, d);
        Person instance = new Person();
        instance.setBDate(y, m, d);
        assertEquals(expResult, instance.getBDate());
    }
    /**
     * Test of setBDate method, of class Person.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testSetBDateFuture() {
        System.out.println("setBDateFuture");
        int y = 2023;
        int m = 01;
        int d = 01;
        Person instance = new Person();
        instance.setBDate(y, m, d);
        fail("Should throw an exception when setting a date in the future");
        
    }

    /**
     * Test of getFavColor method, of class Person.
     */
    @Test
    public void testGetFavColor() {
        System.out.println("getFavColor");
        String favColor = "Green";
        String expResult = "Green";
        Person instance = new Person();
        instance.setFavColor(favColor);
        String result = instance.getFavColor();
        assertEquals(expResult, result);
    }

    /**
     * Test of getLogin method, of class Person.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Person instance = new Person();
        instance.setLastName("*Étienne");
        instance.setFirstName("Étienne");
        String expResult = "EETIENNE";
        String result = instance.getLogin();
        assertEquals(expResult, result);
    }
    
    /**
     * Test of getLogin method, of class Person.
     */
    @Test(expected=IllegalStateException.class)
    public void testGetLoginEmpty() {
        System.out.println("getLogin");
        Person instance = new Person();
        instance.getLogin();
    }

    /**
     * Test of setFavColor method, of class Person.
     */
    @Test
    public void testSetFavColor() {
        System.out.println("setFavColor");
        String favColor = "Blue";
        String expResult = "Blue";
        Person instance = new Person();
        instance.setFavColor(favColor);
        String result = instance.getFavColor();
        assertEquals(expResult, result);
    }
    
}
