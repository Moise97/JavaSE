package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeCloneMethod {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeCloneMethod.class.getName());

    public static void main(String[] args) {
        ArrayDeque<Integer> integerDeque = new ArrayDeque<>(5);

        LOGGER.log(Level.INFO, "Add elements to deque");
        try {
            integerDeque.add(3);
            integerDeque.add(3);
            integerDeque.add(3);
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur ", e);
        }

        LOGGER.log(Level.WARNING, "Performing clone() method for integerDeque!");
        Deque<Integer> integerDeque1 = integerDeque.clone();

        LOGGER.log(Level.INFO, "Print elements available in degue.");
        System.out.println("Deque: ");
        for (Integer i: integerDeque
             ) {
            System.out.print(i + " ");
        }
        System.out.println();
        LOGGER.log(Level.INFO, "Print elements available in cloned deque.");
        System.out.println("Cloned deque: ");
        for (Integer x: integerDeque1
             ) {
            System.out.print(x + " ");
        }
    }
}
