package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansAllPricesEqualTest {

    @Test
    public void calculateSpansAllPricesEqualTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 4}, spans);
    }

}