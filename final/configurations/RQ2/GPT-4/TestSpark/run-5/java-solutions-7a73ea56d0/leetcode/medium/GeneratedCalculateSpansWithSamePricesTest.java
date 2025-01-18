package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithSamePricesTest {

    @Test
    public void calculateSpansWithSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {2, 2, 2, 2, 2};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        int[] expectedSpans = {1, 2, 3, 4, 5};
        assertArrayEquals(expectedSpans, spans);
    }

}