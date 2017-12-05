/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Prof;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author sabrine
 */
public class ProfServiceTest {

    public ProfServiceTest() {
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
     * Test of seConnecter method, of class ProfService.
     */
    @Test
    public void testSeConnecter() {
        System.out.println("seConnecter");
        Prof prof = new Prof("PR1", "Zouani", "Younes", "Y.Z@gmail.com", "sabrine");
        ProfService instance = new ProfService();
        instance.create(prof);
        // TODO review the generated test code and remove the default call to fail.
    }

}
