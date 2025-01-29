package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest_init_with_single_price {

    @Test
    public void test_init_with_single_price() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100};
        onlineStockSpan.init();
        assertEquals(1, onlineStockSpan.count);
        assertEquals(0, onlineStockSpan.maxSubArrayLength);
    }

}