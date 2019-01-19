package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequePopMethod {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequePopMethod.class.getSimpleName());

    public static void main(String[] args) {
        //create an empty array deque with an initial capacity
        Deque<Integer> integerDeque = new ArrayDeque<>(5);

        try {
            integerDeque.add(10);
            integerDeque.add(20);
            integerDeque.add(30);
            integerDeque.add(40);
            integerDeque.add(50);
            LOGGER.log(Level.INFO, "Next add(null) should cause NullPointerException!");
            integerDeque.add(null); // null element is not accepted
            integerDeque.add(60);   // this element is not added to deque.
        }catch (NullPointerException npe){
            LOGGER.log(Level.WARNING, "Exception occur", npe);
        }

        // let us print all the elements available in deque
        LOGGER.log(Level.INFO, "Print all the elements available in deque:");
        for(Integer i : integerDeque){
            System.out.println("Number = " + i);
        }

        LOGGER.log(Level.INFO, "Try to return the element at the front of the deque.");
        try{
            Integer x = integerDeque.pop();
            LOGGER.log(Level.INFO, "Front of deque is; " + x);
        }catch (NoSuchElementException e){
            LOGGER.log(Level.WARNING, "Exception occur during pop() method ", e);
        }

        LOGGER.log(Level.INFO, "Print all the elements available in deque after pop() method run:");
        for(Integer i : integerDeque){
            System.out.println("Number = " + i);
        }


        LOGGER.log(Level.INFO, "Try to add two element to the deque using push() method.");
        try{
            integerDeque.push(10000);
            integerDeque.push(20000);
            integerDeque.push(null); // null is not allowed
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur during push() method ", e);
        }

        LOGGER.log(Level.INFO, "Print all the elements available in deque after push() method");
        for(Integer i : integerDeque){
            System.out.println("Number = " + i);
        }

    }
}
