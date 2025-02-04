package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNextPriceIncreasesTest {

    @Test
    public void nextPriceIncreasesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] priceArray = {0, 2, 1};
        int expectedOutput = new int[]{1, 1, 2};
        assertArrayEquals(expectedOutput, solution.calculateSpans(priceArray));
        assertEquals(2, solution.next(2));
    }

}