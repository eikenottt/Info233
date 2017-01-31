package no.uib.info233.v2017.rei008.oblig1;

/**
 * This interface allows you to <strong>add</strong> and <strong>remove</strong> objects,
 * check a the <strong>size</strong> of a bag
 * as well as if it is <strong>empty</strong> or <strong>full</strong>.
 * furthermore it allows you to <strong>clear</strong> the bag
 * and specify what type of object you want to <strong>count</strong>.
 *
 * Created by rei008 on 31.01.2017.
 * @author rei008
 * @version 0.1
 */
public interface BagInterface<T> {

    /**
     * Returns how many objects there are in a bag.
     * @return the size of the bag
     */
    int getCurrentSize();

    /**
     * Checks if the bag has reached its capacity.
     * @return returns <strong>true</strong> if the bag is full.
     */
    boolean isFull();

    /**
     * Checks if the bag doesn't contain any object
     * @return returns <strong>true</strong> if the bag size is 0
     */
    boolean isEmpty();

    /**
     * Adds one object to the bag
     * @param newEntry the object that is to be added
     * @return returns <strong>true</strong> if the operation was successful
     */
    boolean add(T newEntry);

    /**
     * Removes the lastly added object from the bag
     * @return returns the <strong>object</strong> that were removed
     */
    T remove();

    /**
     * Removes a desired object from the bag
     * @param anEntry the object that is to be removed
     * @return returns <strong>true</strong> if the operation succeeded
     */
    boolean remove(T anEntry);


    /**
     * Removes all objects from the bag
     */
    void clear();

    /**
     * Returns the frequency of an object in the bag
     * @param anEntry the object that will be checked
     * @return returns an <strong>integer</strong> that shows how many objects there were og that
     * specific type
     */
    int getFrequencyOf(T anEntry);
}
