package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeRemoveMethods {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeRemoveMethods.class.getSimpleName());

    public static void main(String[] args) {
        //create an empty array deque with an initial capacity
        Deque<Integer> integerDeque = new ArrayDeque<>(5);

        try {
            integerDeque.add(10);
            integerDeque.add(20);
            integerDeque.add(20);
            integerDeque.add(30);
            integerDeque.add(30);
            integerDeque.add(40);
            integerDeque.add(40);
            integerDeque.add(40);
            integerDeque.add(50);
            integerDeque.add(60);
        }catch (NullPointerException npe){
            LOGGER.log(Level.WARNING, "Exception occur", npe);
        }

        // let us print all the elements available in deque
        LOGGER.log(Level.INFO, "Print all the elements available in deque:");
        for(Integer i : integerDeque){
            System.out.println("Number = " + i);
        }

        LOGGER.log(Level.INFO, "Retrieve and remove the head of deque using remove() method");
        try{
            Integer x = integerDeque.remove();
            LOGGER.log(Level.INFO, "Element removed is: " + x);
        }catch (NoSuchElementException e){
            LOGGER.log(Level.WARNING, "Exception occur during remove() method ", e);
        }

        LOGGER.log(Level.INFO, "Remove a single element of deque using remove(o) method");
        Boolean b = integerDeque.remove(30);
        LOGGER.log(Level.INFO, "Element 30 is removed: " + b);

        LOGGER.log(Level.INFO, "Retrieve and remove the first element of deque using removeFirst() method");
        try{
            Integer x = integerDeque.removeFirst();
            LOGGER.log(Level.INFO, "Element removed is: " + x);
        }catch (NoSuchElementException e){
            LOGGER.log(Level.WARNING, "Exception occur during removeFirst() method ", e);
        }


        LOGGER.log(Level.INFO, "Retrieve and remove the last element of deque using removeLast() method");
        try{
            Integer x = integerDeque.removeLast();
            LOGGER.log(Level.INFO, "Element removed is: " + x);
        }catch (NoSuchElementException e){
            LOGGER.log(Level.WARNING, "Exception occur during removeLast() method ", e);
        }


        LOGGER.log(Level.INFO, "Remove first occurrence of an element  using removeFirstOccurrence(o) method");
        Boolean c = integerDeque.removeFirstOccurrence(40);
        LOGGER.log(Level.INFO, "Element 40 is removed: " + c);


        LOGGER.log(Level.INFO, "Remove last occurrence of an element  using removeLastOccurrence(o) method");
        Boolean d = integerDeque.removeLastOccurrence(40);
        LOGGER.log(Level.INFO, "Element 40 is removed: " + d);

        LOGGER.log(Level.INFO, "Print all the elements available in deque after this operation:");
        for(Integer i : integerDeque){
            System.out.println("Number = " + i);
        }

    }
}
