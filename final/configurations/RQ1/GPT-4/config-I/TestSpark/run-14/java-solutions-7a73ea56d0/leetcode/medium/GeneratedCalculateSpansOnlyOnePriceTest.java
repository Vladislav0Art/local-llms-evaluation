package leetcode.medium;

import static org.junit.Assert.*;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansOnlyOnePriceTest {

    @Test
    public void calculateSpansOnlyOnePriceTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] input = {5};
        int[] expected = {1};
        int[] result = span.calculateSpans(input);
        assertArrayEquals(expected, result);
    }

}