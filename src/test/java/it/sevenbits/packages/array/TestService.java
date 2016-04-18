package it.sevenbits.packages.array;

import it.sevenbits.packages.exceptionPack.NoElementException;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.fail;
import static org.junit.Assert.assertArrayEquals;
/**
 * Test for class Service
 */
public class TestService {

    private Service reverser;

    @Before
    public void setUp() {
        reverser = new Service();
    }

    @Test
    public void testReverseStringArray() throws NoElementException {
        String[] original = {"it","is","unit","test"};
        assertArrayEquals("wrong reverse",original,reverser.reverseTypeArray(original));

    }
    @Test
    public void testReverseCharArray() throws NoElementException {
        Character[] original = {'c','h','a','r'};
        assertArrayEquals("wrong reverse",original,reverser.reverseTypeArray(original));

    }
    @Test
    public void testEmptyReverseStringArray() throws NoElementException {
        String[] original = null;
        assertArrayEquals("wrong reverse",original,reverser.reverseTypeArray(original));
    }
    @Test
    public void testEmptyReverseCharArray() throws NoElementException {
        Character[] original = null;
        assertArrayEquals("wrong reverse",original,reverser.reverseTypeArray(original));
    }
    @Test(expected = NoElementException.class)
    public void testReverseStringArrayWithException() throws NoElementException {
        String[] original = {"it"," ","unit","test"};
        reverser.reverseTypeArray(original);
        fail();
    }
    @Test(expected = NoElementException.class)
    public void testReverseCharArrayWithException() throws NoElementException {
        Character[] original = {'c','h',' ','r'};
        reverser.reverseTypeArray(original);
        fail();
    }
}
