package no.uib.info233.v2017.rei008.oblig1;

/**
 *
 *
 *Created by rei008 on 31.01.2017.
 *
 * @author rei008
 * @version 0.1
 */
public class GeekPerson extends Person {

    @Override
    public String getPersonType() {
        return "Geek";
    }

    @Override
    public String chooseActivity(BagInterface<String> possibleActivities) {

        // TODO check content of bag, choose computer or leave

        return possibleActivities.toString();
    }
}
