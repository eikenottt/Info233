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

    private BagInterface<Person> personBag;
    private Person athletePerson1;
    private Person athletePerson2;
    private Person geekPerson1;
    private Person chuckNorrisPerson1;

    @Before
    public void setUp() throws Exception {
        personBag = new Queue<>();
        athletePerson1 = new AthletePerson();
        athletePerson2 = new AthletePerson();
        geekPerson1 = new GeekPerson();
        chuckNorrisPerson1 = new ChuckNorrisPerson();
    }

    @Test
    public void getCurrentSize() throws Exception {
        assertEquals(5, personBag.getCurrentSize());
    }

    @Test
    public void isFull() throws Exception {
        assertFalse(personBag.isFull());
    }

    @Test
    public void isEmpty() throws Exception {
        assertFalse(personBag.isEmpty());
    }

    @Test
    public void add() throws Exception {
        Person athletePerson3 = new AthletePerson();
        assertTrue(personBag.add(athletePerson3));
    }

    @Test
    public void remove() throws Exception {
        assertEquals(chuckNorrisPerson1, personBag.remove());
    }

    @Test
    public void removeSpesificItem() throws Exception {
        assertTrue(personBag.remove(athletePerson1));
    }

    @Test
    public void clear() throws Exception {
        personBag.clear();
        assertEquals(0, personBag.getCurrentSize());
    }

    @Test
    public void getFrequencyOf() {

    }

}