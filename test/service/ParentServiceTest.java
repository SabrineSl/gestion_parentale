/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import bean.Parent;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author sabrine
 */
public class ParentServiceTest {
    
    public ParentServiceTest() {
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
     * Test of seConnecter method, of class ParentService.
     */
    @Test
    public void testSeConnecter() {
        System.out.println("seConnecter");
        Parent parent = new Parent("P1", "salsil", "abdAli", "abd@gmail.com", "sabrine", 0612552653);
        ParentService instance = new ParentService();
        instance.create(parent);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
