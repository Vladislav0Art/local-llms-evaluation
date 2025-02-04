package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedNextPriceDecreasesTest {

    @Test
    public void nextPriceDecreasesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] priceArray = {0, 1, 2};
        int expectedOutput = new int[]{1, 1, 3};
        assertArrayEquals(expectedOutput, solution.calculateSpans(priceArray));
        assertEquals(3, solution.next(2));
    }

}