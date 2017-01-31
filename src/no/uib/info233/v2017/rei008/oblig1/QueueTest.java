package no.uib.info233.v2017.rei008.oblig1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 *
 *
 *Created by rei008 on 31.01.2017.
 *
 * @author rei008
 * @version 0.1
 */
public class QueueTest {

    private BagInterface<String> bag;


    @Before
    public void setUp() throws Exception {
        bag = new Queue<>();
        bag.add("Finn");
        bag.add("Hei");
        bag.add("Hallo");
        bag.add("Hallo");
        bag.add("Nei");
    }

    @Test
    public void getCurrentSize() throws Exception {
        assertEquals(5,bag.getCurrentSize());
    }

    @Test
    public void isFull() throws Exception {
        assertFalse(bag.isFull());
    }

    @Test
    public void isEmpty() throws Exception {
        assertFalse(bag.isEmpty());
    }

    @Test
    public void add() throws Exception {
        assertTrue(bag.add("Jau"));
    }

    @Test
    public void remove() throws Exception {
        assertEquals("Finn",bag.remove());
    }

    @Test
    public void removeSpesificItem() throws Exception {
        assertTrue(bag.remove("Hei"));
    }

    @Test
    public void clear() throws Exception {
        bag.clear();
        assertEquals(0, bag.getCurrentSize());
    }

    @Test
    public void getFrequencyOf() {
        assertEquals(1, bag.getFrequencyOf("Hei"));
    }

}