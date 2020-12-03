package uk.ac.aber.cs31310.test;

import org.junit.jupiter.api.Test;
import uk.ac.aber.cs31310.FibGenerator;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FibonacciGeneratorTest {

    @Test
    public void testGenerates_0_forInput_0() {
        FibGenerator fibGen = new FibGenerator();
        ArrayList<Integer> values = fibGen.fib(0);
        assertEquals(1, values.size());
        assertEquals(0, values.get(0));
    }

    @Test
    public void testGenerates_1_forInput_1() {
        FibGenerator fibGen = new FibGenerator();
        ArrayList<Integer> values = fibGen.fib(1);
        assertEquals(1, values.size());
        assertEquals(1, values.get(0));
    }

    @Test
    public void testGenerates_0_1_forInput_2() {
        FibGenerator fibGen = new FibGenerator();
        ArrayList<Integer> values = fibGen.fib(2);
        assertEquals(2, values.size());
        assertEquals(0, values.get(0));
        assertEquals(1, values.get(1));
    }

    @Test
    public void testGenerates_0_1_1_forInput_3() {
        FibGenerator fibGen = new FibGenerator();
        ArrayList<Integer> values = fibGen.fib(3);
        assertEquals(3, values.size());

        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(0, 1, 1));
        assertEquals(expected, values);
    }

    @Test
    public void testGenerates_0_1_1_2_forInput_4() {
        FibGenerator fibGen = new FibGenerator();
        ArrayList<Integer> values = fibGen.fib(4);
        assertEquals(4, values.size());

        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(0, 1, 1, 2));
        assertEquals(expected, values);
    }

    @Test
    public void testGenerates_values_forInput_10() {
        FibGenerator fibGen = new FibGenerator();
        ArrayList<Integer> values = fibGen.fib(10);
        assertEquals(10, values.size());

        ArrayList<Integer> expected =
                new ArrayList<>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
        assertEquals(expected, values);
    }

    @Test
    public void testGenerates_emptyList_forInput_minus_1() {
        FibGenerator fibGen = new FibGenerator();
        ArrayList<Integer> values = fibGen.fib(-1);
        assertEquals(0, values.size());
    }

    @Test
    public void testGenerates_string_forInput_10() {
        FibGenerator fibGen = new FibGenerator();
        assertEquals("0, 1, 1, 2, 3, 5, 8, 13, 21, 34", fibGen.fibString(10));
    }
}
