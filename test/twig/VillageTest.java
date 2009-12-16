/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package twig;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ben
 */
public class VillageTest {

    public VillageTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of refreshVillageData method, of class Village.
     */
    @Test
    public void testRefreshVillageData() throws Exception {
        System.out.println("refreshVillageData");
//        Village.refreshVillageData();
        // TODO review the generated test code and remove the default call to fail.
        fail("No Test");
    }

    /**
     * Test of getAllVillages method, of class Village.
     */
    @Test
    public void testGetAllVillages() throws Exception {
        System.out.println("getAllVillages");
//        Village[] expResult = null;
//        Village[] result = Village.getAllVillages();
//        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("No Test");
    }

    /**
     * Test of getK method, of class Village.
     */
    @Test
    public void testGetK1() {
        System.out.println("getK1");
        short x = 967;
        short y = 403;
        Village instance = new Village(0, "name", x, y, 0, 0, 0);
        int expResult = 49;
        int result = instance.getK();
        assertEquals(expResult, result);
    }


    @Test
    public void testGetK2() {
        System.out.println("getK2");
        short x = 890;
        short y = 362;
        Village instance = new Village(0, "name", x, y, 0, 0, 0);
        int expResult = 38;
        int result = instance.getK();
        assertEquals(expResult, result);
    }

    @Test
    public void testDistanceTo1(){
        System.out.println("distanceTo:1");
       double actual = getExronia().distanceTo(getDrolaga());
       double expected = 4.1;
       assertEquals(expected, actual, 0.05);
       actual = getDrolaga().distanceTo(getExronia());
       assertEquals(expected, actual, 0.05);
    }




    private Village getExronia(){
        return new Village(0, "Exronia",967,403,0,0,0);
    }

    private Village getDrolaga(){
        return new Village(0, "Drolaga",963,404,0,0,0);
    }

}