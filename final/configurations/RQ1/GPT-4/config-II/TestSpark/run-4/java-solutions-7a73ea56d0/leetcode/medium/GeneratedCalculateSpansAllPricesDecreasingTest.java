package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesDecreasingTest {

    @Test
    public void calculateSpansAllPricesDecreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {110, 100, 90, 80};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1}, spans);
    }

}