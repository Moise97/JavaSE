package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeSizeMethod {

    private static final Logger LOGGER =  Logger.getLogger(ArrayDequeSizeMethod.class.getSimpleName());

    public static void main(String[] args) {
        Deque<Integer> integerDeque = new ArrayDeque<>();

        try{
            integerDeque.add(2);
            integerDeque.add(5);
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur during add() method", e);
        }

        LOGGER.log(Level.INFO, "The deque isEmpty() : " + integerDeque.isEmpty());
        LOGGER.log(Level.INFO, "Size of deque is: "+ integerDeque.size());
    }
}
