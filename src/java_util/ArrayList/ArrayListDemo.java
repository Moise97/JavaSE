package java_util.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArrayListDemo {
    private static final Logger LOGGER = Logger.getLogger(ArrayListDemo.class.getSimpleName());

    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(10);

        LOGGER.log(Level.INFO, "Add integers to the ArrayList");
        integers.add(1); integers.add(2); integers.add(null);

        LOGGER.log(Level.INFO, "Print all integers from the ArrayList");
        integers.forEach(System.out::println);

        LOGGER.log(Level.INFO, "Insert an element at the specific position in list");
        try{
            integers.add(2, 4);
            integers.add(2, 5);
            integers.add(3, null);
        }catch (IndexOutOfBoundsException e){
            LOGGER.log(Level.WARNING, "Exception occur during insert element in list", e);
        }

        LOGGER.log(Level.INFO, "Print all integers from the ArrayList");
        integers.forEach(System.out::println);

        LOGGER.log(Level.INFO, "Add a collection to list.");
        List<Integer> integerList = Arrays.asList(7, 8, 9);
        try{
            integers.addAll(integerList);
        }catch (NullPointerException npe){  //if the collection is null
            LOGGER.log(Level.WARNING, "Exception occurs when add a collection to ArrayList", npe);
        }

        LOGGER.log(Level.INFO, "Print all integers from the ArrayList");
        integers.forEach(System.out::println);

        ArrayList<Integer> clone = (ArrayList<Integer>) integers.clone();
        LOGGER.log(Level.INFO, "Print all integers from the ArrayList clone list:");
        integers.forEach(System.out::println);

        LOGGER.log(Level.INFO, "Remove all elements of the clone list");
        clone.clear();
        LOGGER.log(Level.INFO, "Size of clone after clear() method is: " + clone.size());

        LOGGER.log(Level.INFO, "The integer list contains element 3: " + integers.contains(3));

        LOGGER.log(Level.INFO, "Increase the capacity of the integers list.");
        integers.ensureCapacity(20);

        LOGGER.log(Level.INFO, "Get an element stored at teh specific position in list");
        try{
            Integer x= integers.get(5);
            LOGGER.log(Level.INFO, "Element stored at position 2 is: " + x);
        }catch (IndexOutOfBoundsException iob){
            LOGGER.log(Level.WARNING, "Exception occured when get() method has called." , iob);
        }

        /*
          ArrayList.indexOf(Object o) - this method returns the index of the first occurrence of
          the specific element in this list, or -1 if this list does not contains the element.
         */
        LOGGER.log(Level.INFO, "Element 5 appear first at index: " + integers.indexOf(5));
        LOGGER.log(Level.INFO, "Element 5 appear last at index: " + integers.lastIndexOf(5));

        LOGGER.log(Level.INFO, "Cloned list is empty: " + clone.isEmpty());

        LOGGER.log(Level.INFO, "Remove an element stored at the specific position");
        try{
            integers.remove(2); //remove the element stored at position 2 in list
        }catch (IndexOutOfBoundsException iob){
            LOGGER.log(Level.WARNING, "Exception occur during remove element stored at index 2in list", iob);
        }

        LOGGER.log(Level.INFO, "Remove an element if it is present.");
        Boolean b;
        b = integers.remove(null);
        LOGGER.log(Level.INFO, "Remove first null element from list was executed with success: " + b);

        LOGGER.log(Level.INFO, "Print all integers from the ArrayList");
        integers.forEach(System.out::println);

        LOGGER.log(Level.INFO, "Replace the element stored at some index with a new value");
        try{
            Integer x = integers.set(1, 50);
            LOGGER.log(Level.INFO, "Successfully replace " + x + " with 50 in list");
        }catch (IndexOutOfBoundsException ioe){
            LOGGER.log(Level.WARNING, "Exception occur during set() method", ioe);
        }

        /*
        The java.util.ArrayList.trimToSize() method trims the capacity of this ArrayList instance to be
        the list's current size.
         */
        integers.trimToSize();
        LOGGER.log(Level.INFO, "Print all integers from the ArrayList");
        integers.forEach(System.out::println);
    }
}
