package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeContainsMethod {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeContainsMethod.class.getSimpleName());

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(5);
        LOGGER.log(Level.INFO, "Add elements to deque");
        try {
            deque.add(4);
            deque.add(7);
            deque.add(11);
            deque.add(23);
            deque.add(31);
            deque.add(47);
            deque.add(43);
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur ", e);
        }

        LOGGER.log(Level.INFO, "Prints all elements available in deque: ");
        for (Integer i: deque
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
        LOGGER.log(Level.INFO, "Deque contains element 25: " + deque.contains(25));
        LOGGER.log(Level.INFO, "Deque contains element 47: " + deque.contains(47));
    }
}
