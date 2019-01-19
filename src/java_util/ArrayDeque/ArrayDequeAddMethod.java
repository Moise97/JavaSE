package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeAddMethod {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeAddMethod.class.getSimpleName());

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


        Deque<Integer> integers = new ArrayDeque<>(5);

        LOGGER.info("Add elements in deque using addFirst() method");
        try {
            integers.addFirst(1);
            integers.addFirst(2);
            integers.addFirst(3);
            integers.addFirst(4);
            integers.addFirst(5);
            LOGGER.log(Level.INFO, "Next addFirst(null) should cause NullPointerException!");
            integers.addFirst(null); // null element is not accepted
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur", e);
        }

        LOGGER.log(Level.INFO, "Print all the elements available in deque:");
        for (Integer i:integers
        ) {
            System.out.println("Number: " + i);
        }

        Deque<Integer> integers1 = new ArrayDeque<>(5);
        LOGGER.info("Add elements in deque using addLast() method");
        try {
            integers1.addLast(100);
            integers1.addLast(200);
            LOGGER.log(Level.INFO, "Next addLast(null) should cause NullPointerException!");
            integers.addLast(null); // null element is not accepted
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur", e);
        }

        LOGGER.info("Print all the elements available in deque:");
        for (Integer i:integers1
        ) {
            System.out.println("Number: " + i);
        }

    }
}
