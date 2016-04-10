package it.sevenbits.packages.exeptionPack;

 /**
 *
 */
public class NoElementException extends Exception {
     /**
      * Print a massage if there is an empty element.
      */
     public final void printMessage() {
         System.out.println("Cannot invert the array: No element!");
     }
}
