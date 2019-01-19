package java_util.ArrayDeque;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayDequeIterator {

    private static final Logger LOGGER = Logger.getLogger(ArrayDequeIterator.class.getSimpleName());

    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(5);

        LOGGER.log(Level.INFO, "Add elements to deque.");

        try{
            deque.add(23);
            deque.add(34);
            deque.addFirst(null);
        }catch (NullPointerException e){
            LOGGER.log(Level.WARNING, "Exception occur ", e);
        }

        LOGGER.log(Level.INFO, "Print elements of deque using iterator.");
        for (Iterator itr = deque.iterator();itr.hasNext();){
            System.out.println(itr.next());
        }

        LOGGER.log(Level.INFO, "Print elements of deque using reverseIterator.");
        for (Iterator descItr = deque.descendingIterator();descItr.hasNext();){
            System.out.println(descItr.next());
        }
    }
}
