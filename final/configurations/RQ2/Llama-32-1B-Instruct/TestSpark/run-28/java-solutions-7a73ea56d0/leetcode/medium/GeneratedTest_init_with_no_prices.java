package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest_init_with_no_prices {

    @Test
    public void test_init_with_no_prices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.init();
        assertEquals(0, onlineStockSpan.count);
        assertEquals(0, onlineStockSpan.maxSubArrayLength);
    }

}