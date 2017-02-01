package no.uib.info233.v2017.rei008.oblig1;

/**
 *
 *
 *Created by rei008 on 31.01.2017.
 *
 * @author rei008
 * @version 0.1
 */
public abstract class Person {

    private String personType;

    private Queue<Person> PersonBag;

    public void setPersonBag(Queue<Person> personBag) {
        PersonBag = personBag;
    }

    public Queue<Person> getPersonBag() {
        return PersonBag;
    }

    public void setPersonType(String personType) {
        this.personType = personType;
    }

    public String getPersonType() {
        return personType;
    }

    public String chooseActivity(BagInterface<String> possibleActivities){
        return null;
    }

}
