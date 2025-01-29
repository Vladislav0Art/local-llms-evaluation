package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_calculateSpans_2 {

    @Test
    public void test_calculateSpans_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40};
        int[][] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(3, Arrays.stream(result[0]).sum());
    }

}