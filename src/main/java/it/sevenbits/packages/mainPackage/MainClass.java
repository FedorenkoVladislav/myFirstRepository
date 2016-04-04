
package it.sevenbits.packages.mainPackage;

import it.sevenbits.packages.exeptionPack.NothingException;
import  it.sevenbits.packages.reverceArray.ReverseArray;

/**
 * MainClass class for realize second homework.
 */
public final class MainClass {
    /**
     * length of array(int)
     */
    private static final int LENGTHOFARRAY = 10;
    /**
     * length of array(anything)
     */
    private static final int SIZE = 5;

    /**
     * Default constructor
     */
    private MainClass() {
    }

    /**
     * Main method
     *
     * @param arg incoming argument
     */
    public static void main(final String[] arg) {
        int[] myArray = new int[LENGTHOFARRAY];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = i;
        }
        ReverseArray invertArray = new ReverseArray();
        invertArray.reverse(myArray);
        Object[] typeArray = new String[SIZE];
        typeArray[0] = "Hello";
        typeArray[1] = "Hell";
        typeArray[2] = "Hel";
        typeArray[3] = "exception";
        typeArray[4] = "H";
        try {
            invertArray.reverseTypeArray(typeArray);
            invertArray.print(typeArray);
            Object[] h = new Character[SIZE];
            h[0] = '1';
            h[1] = '+';
            h[2] = 'u';
            h[3] = '*';
            h[4] = '>';
            invertArray.reverseTypeArray(h);
            invertArray.print(h);
        } catch (NothingException e) {
            e.printMessage();
        } finally {
            System.out.println("\n finally ");
        }
    }
}
