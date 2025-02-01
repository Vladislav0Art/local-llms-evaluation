package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansSingleElementTest {

    @Test
    public void calculateSpansSingleElementTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue("Single element array has span of 1", result[0] == 1);
    }

}