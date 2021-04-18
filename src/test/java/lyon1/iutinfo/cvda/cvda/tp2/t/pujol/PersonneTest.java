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
     * Test of getNom method, of class Personne.
     */
    @Test
    public void testGetNom() {
        System.out.println("getNom");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.getNom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Personne.
     */
    @Test
    public void testSetNomVide() {
        System.out.println("setNomVide");
        String nom = "";
        String expResult = "";
        Personne instance = new Personne();
        instance.setNom(nom);
        assertEquals(expResult, instance.getNom());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNom method, of class Personne.
     */
    @Test
    public void testSetNom() {
        System.out.println("setNom");
        String nom = "petiT-robErt- ";
        String expResult = "PETIT-ROBERT";
        Personne instance = new Personne();
        instance.setNom(nom);
        assertEquals(expResult, instance.getNom());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getPrénom method, of class Personne.
     */
    @Test
    public void testGetPrénom() {
        System.out.println("getPr\u00e9nom");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.getPrénom();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of get_email method, of class Personne.
     */
    @Test
    public void testGet_email() {
        System.out.println("get_email");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.get_email();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of set_email method, of class Personne.
     */
    @Test
    public void testSet_email() {
        System.out.println("set_email");
        String eMail = "";
        Personne instance = new Personne();
        instance.set_email(eMail);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cleanUpString method, of class Personne.
     */
    @Test
    public void testCleanUpString() {
        System.out.println("cleanUpString");
        String str = " TEST--  ";
        Personne instance = new Personne();
        String expResult = "TEST";
        String result = instance.cleanUpString(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    /**
     * Test of trimWithDash method, of class Personne.
     */
    @Test
    public void testTrimWithDash() {
        System.out.println("trimWithDash");
        String str = "--TEST-";
        Personne instance = new Personne();
        String expResult = "TEST";
        String result = instance.trimWithDash(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of toPascalCase method, of class Personne.
     */
    @Test
    public void testToPascalCase() {
        System.out.println("toPascalCase");
        String str = "jean-reNé-bernard- ";
        Personne instance = new Personne();
        String expResult = "Jean-René-Bernard";
        String result = instance.toPascalCase(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrénom method, of class Personne.
     */
    @Test
    public void testSetPrénom() {
        System.out.println("setPr\u00e9nom");
        String prénom = "jeAn-REné ";
        String expResult="Jean-René";
        Personne instance = new Personne();
        instance.setPrénom(prénom); 
        assertEquals(expResult, instance.getPrénom());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setPrénom method, of class Personne.
     */
    @Test
    public void testSetPrénomVide() {
        System.out.println("setPr\u00e9nomVide");
        String prénom = "";
        String expResult="";
        Personne instance = new Personne();
        instance.setPrénom(prénom); 
        assertEquals(expResult, instance.getPrénom());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDdn method, of class Personne.
     */
    @Test
    public void testGetDdn() {
        System.out.println("getDdn");
        Personne instance = new Personne();
        GregorianCalendar expResult = null;
        GregorianCalendar result = instance.getDdn();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDdn method, of class Personne.
     */
    @Test
    public void testSetDdn() {
        System.out.println("setDdn");
        int y = 2021;
        int m = 01;
        int d = 01;
        GregorianCalendar expResult=new GregorianCalendar(y, m, d);
        Personne instance = new Personne();
        instance.setDdn(y, m, d);
        
        assertEquals(expResult, instance.getDdn());
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    /**
     * Test of setDdn method, of class Personne.
     */
    @Test(expected=IllegalArgumentException.class)
    public void testSetDdnFutur() {
        System.out.println("setDdn");
        int y = 2023;
        int m = 01;
        int d = 01;
        Personne instance = new Personne();
        instance.setDdn(y, m, d);
        fail("Should throw an exception when setting a date in the future");
        
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getЛюбимыйцвет method, of class Personne.
     */
    @Test
    public void testGetЛюбимыйцвет() {
        System.out.println("get\u041b\u044e\u0431\u0438\u043c\u044b\u0439\u0446\u0432\u0435\u0442");
        Personne instance = new Personne();
        String expResult = "";
        String result = instance.getЛюбимыйцвет();
        //assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getLogin method, of class Personne.
     */
    @Test
    public void testGetLogin() {
        System.out.println("getLogin");
        Personne instance = new Personne();
        instance.setNom("*Étienne");
        instance.setPrénom("Étienne");
        String expResult = "EETIENNE";
        String result = instance.getLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setЛюбимыйцвет method, of class Personne.
     */
    @Test
    public void testSetЛюбимыйцвет() {
        System.out.println("set\u041b\u044e\u0431\u0438\u043c\u044b\u0439\u0446\u0432\u0435\u0442");
        String любимыйцвет = "";
        Personne instance = new Personne();
        instance.setЛюбимыйцвет(любимыйцвет);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
