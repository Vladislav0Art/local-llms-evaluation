package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansIncreasingPricesTest {

    @Test
    public void calculateSpansIncreasingPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {1, 2, 3, 4, 5, 6, 7};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

}