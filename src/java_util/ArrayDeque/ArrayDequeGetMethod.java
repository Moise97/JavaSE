package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeGetMethod {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeGetMethod.class.getSimpleName());

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

        LOGGER.log(Level.INFO, "Attempting to get first element of the deque using getFirst() method");
        try{
            int val = integerDeque.getFirst();
            System.out.println("First element is: " + val);
        }catch (NoSuchElementException e){
            LOGGER.log(Level.WARNING, "Exception occur during getFirst() method.",e);
        }

        LOGGER.log(Level.INFO, "Attempting to retrieve the head of the deque using peek() method");
        System.out.println("Head of deque is: " + integerDeque.peek());

        LOGGER.log(Level.INFO, "Attempting to retrieve the head of the deque using peekFirst() method");
        System.out.println("Head of deque is: " + integerDeque.peekFirst());

        LOGGER.log(Level.INFO, "Attempting to retrieve the last element of the deque using peek() method");
        System.out.println("Last element of deque is: " + integerDeque.peekLast());

        LOGGER.log(Level.INFO, "Attempting to get last element of the deque using getLast() method");
        try{
            int val = integerDeque.getLast();
            System.out.println("Last element is: " + val);
        }catch (NoSuchElementException e){
            LOGGER.log(Level.WARNING, "Exception occur during getLast() method.");
        }
    }
}
