package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest_calculateSpans {

    @Test
    public void test_calculateSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 200};
        onlineStockSpan.prices = prices;
        onlineStockSpan.init();
        assertEquals(2, onlineStockSpan.count);
        assertEquals(1, onlineStockSpan.maxSubArrayLength);
    }

}