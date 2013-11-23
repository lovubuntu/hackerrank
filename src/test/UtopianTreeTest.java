package test;

import utopiantree.UtopianTree;

import static junit.framework.Assert.*;

/**
 * Created with IntelliJ IDEA.
 * User: prince
 * Date: 21/11/13
 * Time: 11:20 PM
 * To change this template use File | Settings | File Templates.
 */
public class UtopianTreeTest {
    private UtopianTree utopianTree;
    @org.junit.Before
    public void setUp() throws Exception {
        utopianTree = new UtopianTree();
    }

    @org.junit.Test
    public void testCalculateHeight() throws Exception {
        assertEquals(1, utopianTree.calculateHeight(0));
        assertEquals(2,utopianTree.calculateHeight(1));
        assertEquals(3,utopianTree.calculateHeight(2));
        assertEquals(6,utopianTree.calculateHeight(3));
        assertEquals(7,utopianTree.calculateHeight(4));
    }
}
