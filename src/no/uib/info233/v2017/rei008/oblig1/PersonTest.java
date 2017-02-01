package no.uib.info233.v2017.rei008.oblig1;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by runeeikemo on 01.02.2017.
 */
public class PersonTest {

    private Person testPerson;

    @Before
    public void setUp() throws Exception {
        testPerson = new AthletePerson();
    }

    @Test
    public void getPersonType() throws Exception {
        assertEquals("Athlete",testPerson.getPersonType());
    }

    @Test
    public void chooseActivity() throws Exception {

    }

}