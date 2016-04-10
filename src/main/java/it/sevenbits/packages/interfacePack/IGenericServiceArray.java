package it.sevenbits.packages.interfacePack;

import it.sevenbits.packages.exceptionPack.NoElementException;

 /**
 * The generic interface is service of array type T.
 */
public interface IGenericServiceArray {
    /**
     * Reverse array type of T.
     * @param <T> is a type
     * @param array array of T
     * @throws NoElementException if there is empty element - print message and terminates
     * @return reversed array
     */
    <T> T[] reverseTypeArray(final T[] array) throws NoElementException;

    /**
     * Print array type of T.
     * @param <T> is a type
     * @param array array of T
     *
     */
    <T> void printArray(final T[] array);
}
