package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest_calculateSpans_with_multiple_prices {

    @Test
    public void test_calculateSpans_with_multiple_prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100, 200};
        onlineStockSpan.init();
        assertEquals(2, onlineStockSpan.count);
        assertEquals(1, onlineStockSpan.maxSubArrayLength);
    }

}