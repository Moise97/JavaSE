package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequePollMethod {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequePollMethod.class.getSimpleName());

    public static void main(String[] args) {
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

        LOGGER.log(Level.INFO, "Try to retrieve and delete the head of the deque using poll() method");
        Integer x = integers.poll();
        LOGGER.log(Level.INFO, "Head of deque was: " + x);

        LOGGER.log(Level.INFO, "Print all the elements available in deque after poll() method:");
        for (Integer i:integers
        ) {
            System.out.println("Number: " + i);
        }

        LOGGER.log(Level.INFO, "Try to retrieve and delete the head of the deque using pollFirst() method");
        Integer y = integers.pollFirst();
        LOGGER.log(Level.INFO, "Head of deque was: " + y);

        LOGGER.log(Level.INFO, "Print all the elements available in deque after pollFirst() method:");
        for (Integer i:integers
        ) {
            System.out.println("Number: " + i);
        }

        LOGGER.log(Level.INFO, "Try to returns the tail of this deque, or null if this deque is empty using " +
                "pollLast() method");
        Integer z = integers.pollLast();
        LOGGER.log(Level.INFO, "Tail of deque was: " + z);

        LOGGER.log(Level.INFO, "Print all the elements available in deque after pollLast() method:");
        for (Integer i:integers
        ) {
            System.out.println("Number: " + i);
        }

    }
}
