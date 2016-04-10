
package it.sevenbits.packages.mainPackage;

import it.sevenbits.packages.array.Service;
import it.sevenbits.packages.exceptionPack.NoElementException;
import it.sevenbits.packages.array.Essence;

/**
 * MainClass class for realize second homework.
 */
public final class MainClass {
    /**
     * length of array(int).
     */
    private static final int LENGTHOFARRAY = 10;
    /**
     * Default constructor.
     */
    private MainClass() {
    }

    /**
     * @param arg incoming argument
     * @throws NoElementException if is empty element - print message and terminates.
     */
    public static void main(final String[] arg) throws NoElementException {

        Integer[] intArray = new Integer[LENGTHOFARRAY];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i;
        }

        Essence<Integer> integerEssence = new Essence<Integer>();
        integerEssence.setOtherArray(intArray);

        Service service = new Service();
        System.out.println("The original array of INTEGER:");
        service.printArray(integerEssence.getArray());
        System.out.println("\nThe reverse array of INTEGER:");
        service.printArray(service.reverseTypeArray(integerEssence.getArray()));

        System.out.println("\n ---------------------------------");
        String[] strArray = {"Java", " ", "wonderful", "programming", "language"};
        Essence<String> stringEssence = new Essence<String>();
        stringEssence.setOtherArray(strArray);
        try {
            System.out.println("\nThe original array of STRING:");
            service.printArray(stringEssence.getArray());
            System.out.println("\nThe reverse array of STRING:");
            service.printArray(service.reverseTypeArray(stringEssence.getArray()));

        } catch (NoElementException e) {
            e.printMessage();
        } finally {
            System.out.println("finally block :insert anything in place of the empty element and try again");
            strArray[1] = "is a";
            System.out.println("\nThe reverse array of STRING:");
            service.printArray(service.reverseTypeArray(stringEssence.getArray()));
        }
        System.out.println("\n ---------------------------------");
        Character[] charArray = {'c', 'h', 'a', ' ', 'r'};
        Essence<Character> characterEssence = new Essence<Character>();
        characterEssence.setOtherArray(charArray);
        try {

            System.out.println("\nThe original array of CHAR:");
            service.printArray(characterEssence.getArray());
            System.out.println("\nThe reverse array of CHAR:");
            service.printArray(service.reverseTypeArray(characterEssence.getArray()));

        } catch (NoElementException e) {
            e.printMessage();
        }
    }
}
