package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_calculateSpans_3 {

    @Test
    public void test_calculateSpans_3() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 200, 300};
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        int[][] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(4, Arrays.stream(result[0]).sum());
    }

}