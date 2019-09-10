/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EnumType;

import java.time.DayOfWeek;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sayyid
 */
public class EnumTestTest {
    
    public EnumTestTest() {
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
     * Test of tellItLikeItIs method, of class EnumTest.
     */
    @Test
    public void testTellItLikeItIs() {
        System.out.println("tellItLikeItIs");
        EnumTest instance = new EnumTest(DayOfWeek.MONDAY);
        instance.tellItLikeItIs();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class EnumTest.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        EnumTest.main(args);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
