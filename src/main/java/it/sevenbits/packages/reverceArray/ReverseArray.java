
package it.sevenbits.packages.reverceArray;

import it.sevenbits.packages.exeptionPack.NothingException;
import it.sevenbits.packages.interfacePack.IPrintable;
import it.sevenbits.packages.interfacePack.IReverseArray;

/**
 * ReverseArray class for inverse array of integer.
 */
public class ReverseArray implements IPrintable, IReverseArray {

    /**
     * Reverse array of integer
     *
     * @param array of integer
     * @return reversed array of integer
     */
    public final int[] reverse(final int[] array) {
        if (array == null) {
            return null;
        }
        for (int i = 0; i < array.length / 2; i++) {
            int tempValue = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempValue;
        }
        return array;
    }

    /**
     * Print array of integer on the display
     *
     * @param array of integer
     */
    public final void print(final Object[] array) {
        for (Object x : array) {
            System.out.print(x + " ");
        }
    }

    /**
     * Reverse array of T
     *
     * @param <T>   is a type
     * @param array is array with elements type T
     * @throws NothingException if is word "exception"
     * @return reversed array of T
     */
    public final <T> T[] reverseTypeArray(final T[] array) throws NothingException {
        if (array == null) {
            return null;
        }
        for (T tmp: array) {
            if (tmp == "exception") {
                throw new NothingException();
            }
        }
        for (int i = 0; i < array.length / 2; i++) {

            T tempValue = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tempValue;
        }
        return array;
    }
}