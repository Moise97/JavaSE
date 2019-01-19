package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeElementMethod {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeElementMethod.class.getSimpleName());

    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();

        LOGGER.log(Level.INFO, "Add elements to deque.");

        try{
            integerDeque.add(3);
            integerDeque.addFirst(2);
            integerDeque.addLast(4);
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur ", e);
        }

        LOGGER.log(Level.INFO, "Print all element of deque using iterator");
        for (Iterator itr = integerDeque.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }

        // element() method wii retrieve element at first(head) position
        LOGGER.log(Level.WARNING, "Perform element() method for deque.");
        try{
            int val = integerDeque.element();
            System.out.println("Retrieved element is: " + val);
        }catch (NoSuchElementException nsee) {
            LOGGER.log(Level.SEVERE, "Exception occur during element() method ", nsee);
        }

        LOGGER.log(Level.INFO, "Perform clear() method and try element() again.");
        integerDeque.clear();
        LOGGER.log(Level.INFO, "Deque contains " + integerDeque.size() + " elements");
        try {
            int elem = integerDeque.element();
        }catch (NoSuchElementException e){
            LOGGER.log(Level.SEVERE, "Exception occur during element() method!!!!",e);
        }
    }
}
