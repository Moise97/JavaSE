package java_util.Arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ArraysDemo {

    private static final Logger LOGGER = Logger.getLogger(ArraysDemo.class.getSimpleName());

    public static void main(String[] args) {
        LOGGER.log(Level.INFO, "Create a fixed size list backed by the specified array");
        // create an array of string
        String a[] = new String[]{"A","B","C"};
        List list = Arrays.asList(a);
        System.out.println(list);

        LOGGER.log(Level.INFO, "Create a new list,sort and print them.");
        byte byteArray[] = {10, 20, 50, 40, 30};

        LOGGER.log(Level.INFO, "Sort list using sort() method");
        Arrays.sort(byteArray);
        for (Byte b:byteArray) {
            System.out.print(b + " ");
        }

        /*
        In order to use binarySearch() algorithm on a Array we must sort them.
         */
        LOGGER.log(Level.INFO, "Find elements in array using binarySearch() method.");
        Integer var = Arrays.binarySearch(byteArray, (byte) 30);
        System.out.println("Byte 30 was found at index: " + var);

        try{
            LOGGER.log(Level.INFO, "Try to find an element between 2 given index");
            int idx = Arrays.binarySearch(byteArray,2 , 3, (byte)30);
            System.out.println("Byte 30 was found between index:2 and 3: " + idx);
        }catch (IllegalArgumentException | ArrayIndexOutOfBoundsException ex){
            LOGGER.log(Level.INFO, "Exception occur during binarySearch() method", ex);
        }

        Integer b[] = {3, 5 , 1};
        Arrays.stream(b).forEach(System.out::println);
        LOGGER.log(Level.INFO, "Define a comparator witch sorting in natural ordering");
        Comparator<Integer> comp = null; // null is used for natural ordering
        Arrays.sort(b, comp);
        Arrays.stream(b).forEach(System.out::println);

        int [] arr1= new int[]{33, 44, 55, 66};
        LOGGER.log(Level.INFO,"Create a new array and print it's values to console.");
        Arrays.stream(arr1).forEach(System.out::println);
        LOGGER.log(Level.INFO, "Create a new copy of initial array, truncated or padded with zeros");
        try {
            int[] arr2 = Arrays.copyOf(arr1, 8);
            arr2[4] = 77;
            Arrays.stream(arr2).forEach(System.out::println);
        }catch (NegativeArraySizeException | NullPointerException e){
            LOGGER.log(Level.WARNING,"Exception occur during copy of the array", e);
        }

        LOGGER.log(Level.INFO,"Create a new array using Arrays.copyOfRange() method");
        try {
            int[] arr3 = Arrays.copyOfRange(arr1, 2, 5);
            Arrays.stream(arr3).forEach(System.out::println);
        }catch (ArrayIndexOutOfBoundsException | IllegalArgumentException | NullPointerException e){
            LOGGER.log(Level.WARNING,"Exception occur during copyOfRange() method", e);
        }
        Integer[] c= b.clone();
        LOGGER.log(Level.INFO,"Verify if b is equal with c(clone of b): "+ Arrays.deepEquals(b, c));

        LOGGER.log(Level.INFO, "Deep hash code of c is: " + Arrays.deepHashCode(c));
        LOGGER.log(Level.INFO, "Hash code of c is: " + Arrays.hashCode(c));

        LOGGER.log(Level.INFO, "String representation of c using deepToString() is: " + Arrays.deepToString(c));
        LOGGER.log(Level.INFO, "String representation of c using toString() is: " + Arrays.toString(c));

        LOGGER.log(Level.INFO , "Array b is equal with c: " + Arrays.equals(b, c));

        LOGGER.log(Level.INFO,"Assign a specific value to each element of array.");
        Arrays.fill(b, 4);
        Arrays.stream(b).forEach(System.out::println);

        LOGGER.log(Level.INFO,"Sort array c using sort() method");
        Arrays.sort(c);
        Arrays.stream(c).forEach(System.out::println);
    }
}
