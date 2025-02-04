package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNextPriceDecreasesToZeroThenIncreases {

    @Test
    public void nextPriceDecreasesToZeroThenIncreases() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] priceArray = {0, 1, 0, 2};
        int expectedOutput = new int[]{1, 1, 1, 4};
        assertArrayEquals(expectedOutput, solution.calculateSpans(priceArray));
        assertEquals(4, solution.next(2));
    }

}