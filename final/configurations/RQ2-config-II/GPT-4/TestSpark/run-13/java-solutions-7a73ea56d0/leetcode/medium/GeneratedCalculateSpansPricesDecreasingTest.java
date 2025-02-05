package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansPricesDecreasingTest {

    @Test
    public void calculateSpansPricesDecreasingTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = new int[]{100, 80, 60, 40};
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 1}, result);
    }

}