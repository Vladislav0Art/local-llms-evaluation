package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansAllPricesSameTest {

    @Test
    public void calculateSpansAllPricesSameTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {5, 5, 5, 5, 5, 5, 5};
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

}