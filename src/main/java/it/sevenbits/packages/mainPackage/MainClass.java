
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

        try {
            Integer[] intArray = new Integer[LENGTHOFARRAY];
            for (int i = 0; i < intArray.length; i++) {
                intArray[i] = i;
            }

            Essence<Integer> integerEssence = new Essence<Integer>();
            integerEssence.setOtherArray(intArray);

            Service service = new Service();
            System.out.println("The original array of INTEGER:");
            for (int i : integerEssence.getArray()) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("\nThe reverse array of INTEGER:");
            for (int i : service.reverseTypeArray(integerEssence.getArray())) {
                System.out.print(i + " ");
            }
            System.out.println();
            System.out.println("\n ---------------------------------");
            String[] strArray = {"Java", "is a", "wonderful", "programming", "language"};
            Essence<String> stringEssence = new Essence<String>();
            stringEssence.setOtherArray(strArray);

            System.out.println("\nThe original array of STRING:");
            for (String s : stringEssence.getArray()) {
                System.out.print(s + " ");
            }
            System.out.println();
            System.out.println("\nThe reverse array of STRING:");
            for (String s : service.reverseTypeArray(stringEssence.getArray())) {
                System.out.print(s + " ");
            }
            System.out.println();

            System.out.println("\n ---------------------------------");
            Character[] charArray = {'c', 'h', 'a', ' ', 'r'};
            Essence<Character> characterEssence = new Essence<Character>();
            characterEssence.setOtherArray(charArray);


            System.out.println("\nThe original array of CHAR:");
            for (Character c : characterEssence.getArray()) {
                System.out.print(c + " ");
            }
            System.out.println();
            System.out.println("\nThe reverse array of CHAR:");
            for (Character c : service.reverseTypeArray(characterEssence.getArray())) {
                System.out.print(c + " ");
            }
            System.out.println();
        } catch (NoElementException e) {
            e.printMessage();
        }
    }
}
