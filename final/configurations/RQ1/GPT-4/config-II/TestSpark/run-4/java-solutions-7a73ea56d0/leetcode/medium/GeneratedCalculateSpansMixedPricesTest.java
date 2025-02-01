package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansMixedPricesTest {

    @Test
    public void calculateSpansMixedPricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 1, 1, 2, 1, 4, 6}, spans);
    }

}