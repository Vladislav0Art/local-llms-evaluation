package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNextPriceIsZeroTest {

    @Test
    public void nextPriceIsZeroTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] priceArray = {0, 1};
        int expectedOutput = new int[]{1, 1};
        assertArrayEquals(expectedOutput, solution.calculateSpans(priceArray));
        assertEquals(1, solution.next(0));
    }

}