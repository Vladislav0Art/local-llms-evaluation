package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithDecreasingPricesTest {

    @Test
    public void calculateSpansWithDecreasingPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {6, 5, 4, 3, 2};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        int[] expectedSpans = {1, 1, 1, 1, 1};
        assertArrayEquals(expectedSpans, spans);
    }

}