/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Admine;
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
public class AdminServiceTest {
    
    public AdminServiceTest() {
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
     * Test of seConnecter method, of class AdminService.
     */
    @Test
    public void testSeConnecter() {
        System.out.println("seConnecter");
        Admine admin = new Admine("A1", "sabrine");
        AdminService instance = new AdminService();
         instance.create(admin);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
