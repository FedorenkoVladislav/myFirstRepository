package it.sevenbits.packages.array;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Test for class Essence
 */
public class TestEssence {

    private Essence testArray;

    @Before
    public void setUp() {

        testArray = new Essence();
    }
    @Test
    public void testGetSetArrayInteger() {
        Integer[] original = {1,2,3};
        testArray.setOtherArray(original);
        Integer[] other = (Integer[]) testArray.getArray();
        assertArrayEquals("wrong",original,other);
    }
    @Test
    public void testGetSetArrayString() {
        String[] original = {"Hello",",","world!"};
        testArray.setOtherArray(original);
        String[] other = (String[]) testArray.getArray();
        assertArrayEquals("wrong",original,other);
    }

    @Test
    public void testGetSetArrayChar() {
        Character[] original = {'a','b','c'};
        testArray.setOtherArray(original);
        Character[] other =(Character[]) testArray.getArray();
        assertArrayEquals("wrong",original,other);
    }
}