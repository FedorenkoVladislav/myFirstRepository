package it.sevenbits.packages.interfacePack;

import it.sevenbits.packages.exeptionPack.NothingException;

/**
 *
 */
public interface IReverseArray {
    /**
     *
     * @param <T> is a type
     * @param array array of T
     * @throws NothingException if there is word "exception"
     * @return reversed array
     */
    <T> T[] reverseTypeArray(final T[] array) throws NothingException;
}
