package leetcode.medium;

import org.junit.jupiter.api.Test;

public class GeneratedTest_maxSubArrayLength {

    @Test
    public void test_maxSubArrayLength() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.prices = new int[]{100, 200, -200};
        onlineStockSpan.init();
        assertEquals(2, onlineStockSpan.maxSubArrayLength);
    }

}