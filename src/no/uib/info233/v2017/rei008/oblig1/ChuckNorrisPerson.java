package no.uib.info233.v2017.rei008.oblig1;

/**
 *
 *
 *Created by rei008 on 31.01.2017.
 *
 * @author rei008
 * @version 0.1
 */
public class ChuckNorrisPerson extends Person {

    private Queue<Person> chuck = new Queue<>();

    public ChuckNorrisPerson() {
        super.setPersonType("ChuckNorris");
        super.setPersonBag(chuck);
    }

    @Override
    public String chooseActivity(BagInterface<String> possibleActivities) {

        // TODO check content of bag, choose in this order computer, spinning, swimming, running.


        return super.chooseActivity(possibleActivities);
    }
}
