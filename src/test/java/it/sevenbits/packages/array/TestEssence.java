package it.sevenbits.packages.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for class Essence
 */
public class TestEssence {

    private Essence<Integer> testArrayInteger;
    private Essence<String> testArrayString;
    private Essence<Character> testArrayChar;

    @Before
    public void setUp() {

        testArrayInteger = new Essence<Integer>();
        testArrayChar = new Essence<Character>();
        testArrayString = new Essence<String>();
    }
    @Test
    public void testGetSetArrayInteger() {
        Integer[] original = {1,2,3};
        testArrayInteger.setOtherArray(original);
        assertArrayEquals("wrong",original,testArrayInteger.getArray());
    }
    @Test
    public void testGetSetArrayString() {
        String[] original = {"Hello",",","world!"};
        testArrayString.setOtherArray(original);
        assertArrayEquals("wrong",original,testArrayString.getArray());
    }

    @Test
    public void testGetSetArrayChar() {
        Character[] original = {'a','b','c'};
        testArrayChar.setOtherArray(original);
        assertArrayEquals("wrong",original,testArrayChar.getArray());
    }
}