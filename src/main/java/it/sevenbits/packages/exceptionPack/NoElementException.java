package it.sevenbits.packages.exceptionPack;

 /**
 *
 */
public class NoElementException extends Throwable {
     /**
      * Print a massage if there is an empty element
      * @param message message.
      */
     public NoElementException(final String message) {
         super(message);
     }
}
