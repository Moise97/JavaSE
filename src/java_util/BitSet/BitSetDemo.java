package java_util.BitSet;

import java.util.BitSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The java.util.BitSet class implements a vector of bits that grows as needed.
 * A BitSet is not safe for multithreaded use without external synchronization.
 * All bits in the set initially have the value false.
 * Passing a null parameter to any of the method in a BitSet result in a NullPointerException.
 */
public class BitSetDemo {

    private static final Logger LOGGER = Logger.getLogger(BitSetDemo.class.getSimpleName());

    public static void main(String[] args) {

        // create two bitset
        BitSet bitSet1;
        BitSet bitSet2 = new BitSet(8);

        bitSet1 = allowValueToBitSet();
        bitSet2.set(2); bitSet2.set(4);
        System.out.println(bitSet1.toString());
        LOGGER.log(Level.INFO,"The following example shows the usage of java.util.BitSet.and() method.");
        bitSet2.and(bitSet1); // perform and operation
        System.out.println(bitSet2.toString());
        LOGGER.log(Level.INFO,"The following example shows the usage of java.util.BitSet.andNot() method.");
        bitSet1.andNot(bitSet2); // perform andNot() operation
        System.out.println(bitSet1.toString());
        LOGGER.log(Level.INFO,"The following example shows the usage of java.util.BitSet.or() method.");
        bitSet1.or(bitSet2); // perform or() operation
        System.out.println(bitSet1.toString());
        LOGGER.log(Level.INFO,"The following example shows the usage of java.util.BitSet.xor() method.");
        bitSet1.xor(bitSet2); // perform xor() operation
        System.out.println(bitSet1.toString());

        LOGGER.log(Level.INFO,"Find the number od bits set to true in the BitSet");
        System.out.println("BitSet1.cardinality() = " + bitSet1.cardinality());

        LOGGER.log(Level.INFO,"Set the number of bits in the BitSet to false.");
        bitSet2.clear();
        System.out.println("BitSet2 = " + bitSet2.toString());

        LOGGER.log(Level.INFO,"Clone a BitSet.");
        BitSet bitSet3 = (BitSet) bitSet1.clone();
        System.out.println("BitSet3(clone of bitSet1) = " + bitSet3.toString());

        LOGGER.log(Level.INFO,"Verify if bitSet1 is equal to bitset3: " + bitSet1.equals(bitSet3));

        LOGGER.log(Level.INFO,"Set the bit at the specific index to the complement of its current value");
        try{
            bitSet1.flip(1);
            System.out.println("BitSet1: " + bitSet1.toString());
        }catch (IndexOutOfBoundsException e){
            LOGGER.log(Level.WARNING,"Exception occur during flip() method ", e);
        }

        try{
            System.out.println("BitSet1.get(1) = " + bitSet1.get(1));
        }catch (IndexOutOfBoundsException e){
            LOGGER.log(Level.WARNING,"Exception occur during get() method", e);
        }

        LOGGER.log(Level.INFO,"BitSet1 intersects Bitset3: " + bitSet1.intersects(bitSet3));

        LOGGER.log(Level.INFO,"Bitset2 is empty: "+ bitSet2.isEmpty());

        LOGGER.log(Level.INFO,"Bitset3 length is: " + bitSet3.length());

        /*
        The java.util.BitSet.nextClearBit(int idx) return the index of the first bit that is set to false that occur
        after the specific starting index.

        The java.util.BitSet.nextClearBit(int idx) return the index of the first bit that is set to true that occur
        after the specific starting index.
         */
        try{
            LOGGER.log(Level.INFO,"BitSet1.nextClearBit(2) is: " + bitSet1.nextClearBit(2));
            LOGGER.log(Level.INFO,"BitSet1.nextSetBit(2) is: " + bitSet1.nextSetBit(2));
        }catch (IndexOutOfBoundsException e){
            LOGGER.log(Level.WARNING,"Exception occur ",e);
        }

        LOGGER.log(Level.INFO,"The following example shows the usage of java.util.BitSet.set() method.");
        try{
            bitSet1.set(3);
            bitSet1.set(2,Boolean.FALSE);
            bitSet1.set(4,6);
            bitSet1.set(0,1,Boolean.FALSE);
        }catch (IndexOutOfBoundsException e){
            LOGGER.log(Level.WARNING,"Exception occur", e);
        }
        System.out.println(bitSet1.toString());
    }

    private static BitSet allowValueToBitSet(){
        BitSet bitSet = new BitSet();
        bitSet.set(0);
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(3);
        bitSet.set(4);
        bitSet.set(5);
        return bitSet;
    }
}
