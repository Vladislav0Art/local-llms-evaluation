package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansDifferentPricesTest {

    @Test
    public void calculateSpansDifferentPricesTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {100, 80, 60, 70, 60, 75, 85};
        int[] expected = {1, 1, 1, 2, 1, 4, 6};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

}