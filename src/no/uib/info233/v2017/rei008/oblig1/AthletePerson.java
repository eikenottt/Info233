package no.uib.info233.v2017.rei008.oblig1;

/**
 *
 *
 *Created by rei008 on 31.01.2017.
 *
 * @author rei008
 * @version 0.1
 */
public class AthletePerson extends Person {

    @Override
    public String getPersonType() {
        return "athlete";
    }

    @Override
    public String chooseActivity(BagInterface<String> possibleActivities) {
        // TODO check content of bag, choose any physical activity (spinning, swimming, running) or leave

        return super.chooseActivity(possibleActivities);
    }
}
