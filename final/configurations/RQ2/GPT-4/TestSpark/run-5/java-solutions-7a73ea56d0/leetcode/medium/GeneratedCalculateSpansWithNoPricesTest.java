package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansWithNoPricesTest {

    @Test
    public void calculateSpansWithNoPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        int[] expectedSpans = {};
        assertArrayEquals(expectedSpans, spans);
    }

}