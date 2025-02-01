package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesIncreasingTest {

    @Test
    public void calculateSpansAllPricesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {80, 90, 100, 110};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, spans);
    }

}