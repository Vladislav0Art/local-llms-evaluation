package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansSamePricesTest {

    @Test
    public void calculateSpansSamePricesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 100, 100, 100, 100};
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, onlineStockSpan.calculateSpans(prices));
    }

}