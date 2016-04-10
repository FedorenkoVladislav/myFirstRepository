 package it.sevenbits.packages.array;

 /**
 * the class is essence of array type T.
 * @param <T> is a type
 */
public class Essence<T>  {

    /**
      * <T> is a type.
      */
     private T[] array;

    /**
     *
     * @return array
     */
     public final T[] getArray() {
         return array;
     }

    /**
     *
     * @param otherArray new value for variable array
     */
    public final void setOtherArray(final T[] otherArray) {
        array = otherArray;
    }
}