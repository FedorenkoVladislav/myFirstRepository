package it.sevenbits.packages.exceptionPack;

 /**
 *
 */
public class NoElementException extends Exception {
     /**
      * Print a massage if there is an empty element.
      */
     public final void printMessage() {
         System.out.println("EXCEPTION : Cannot invert the array: No element!");
     }
}
