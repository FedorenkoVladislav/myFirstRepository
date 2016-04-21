package it.sevenbits.packages.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for class Essence
 */
public class TestEssence {

    @Before
    public void setUp() { }
    @Test
    public void testGetSetArrayInteger() {
        Essence<Integer> testArrayInteger = new Essence<Integer>();
        Integer[] original = {1,2,3};
        testArrayInteger.setOtherArray(original);
        Integer[] other = testArrayInteger.getArray();
        assertArrayEquals("wrong",original,other);
    }
    @Test
    public void testGetSetArrayString() {
        Essence<String> testArrayString = new Essence<String>();
        String[] original = {"Hello",",","world!"};
        testArrayString.setOtherArray(original);
        String[] other = testArrayString.getArray();
        assertArrayEquals("wrong",original,other);
    }

    @Test
    public void testGetSetArrayChar() {
        Essence<Character> testArrayChar = new Essence<Character>();
        Character[] original = {'a','b','c'};
        testArrayChar.setOtherArray(original);
        Character[] other =testArrayChar.getArray();
        assertArrayEquals("wrong",original,other);
    }
}