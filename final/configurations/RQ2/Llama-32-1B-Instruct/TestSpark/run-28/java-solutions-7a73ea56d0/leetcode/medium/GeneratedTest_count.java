package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest_count {

    @Test
    public void test_count() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100, 200, 300};
        onlineStockSpan.init();
        assertEquals(3, onlineStockSpan.count);
        assertEquals(1, onlineStockSpan.maxSubArrayLength);
    }

}