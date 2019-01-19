package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeClearMethod {

    private final static Logger LOGGER = Logger.getLogger(ArrayDequeClearMethod.class.getSimpleName());

    public static void main(String[] args) {
        Deque<Double> doubles = new ArrayDeque<>(5);

        LOGGER.log(Level.INFO, "Add elements to deque.");

        try{
            doubles.add(10d);
            doubles.add(20d);
            doubles.addFirst(9d);
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur" , e);
        }

        LOGGER.log(Level.INFO, "Print all elements available in deque.");
        for (Double d:doubles
             ) {
            System.out.println("Number: " + d);
        }

        LOGGER.log(Level.INFO, "Size of deque is " +doubles.size());
        LOGGER.log(Level.WARNING, "Performing clear() operation");
        doubles.clear();
        LOGGER.log(Level.INFO, "Now, degue consist of " + doubles.size() + " elements");
    }
}
