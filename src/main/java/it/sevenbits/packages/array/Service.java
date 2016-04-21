 package it.sevenbits.packages.array;

import it.sevenbits.packages.exceptionPack.NoElementException;
import it.sevenbits.packages.interfacePack.IGenericServiceArray;

 /**
 * Class is service for array type T.
 */
public class Service implements IGenericServiceArray {
    /**
     * Reverse array of T.
     * @param <T> is a type
     * @param array is array with elements type T
     * @throws NoElementException if is empty element print message and break
     * @return reversed array of T
     */
    public final <T> T[] reverseTypeArray(final T[] array) throws NoElementException {
        if (array == null) {
            return null;
        }
        for (T tmp: array) {
            if (tmp.toString().equals(" ")) {
                throw new NoElementException("NOTHING");
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
