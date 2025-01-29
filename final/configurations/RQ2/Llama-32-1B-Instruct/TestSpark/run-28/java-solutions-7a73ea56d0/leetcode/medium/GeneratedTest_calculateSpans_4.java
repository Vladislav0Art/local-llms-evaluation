package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_calculateSpans_4 {

    @Test
    public void test_calculateSpans_4() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        onlineStockSpan.next(3);
        onlineStockSpan.next(4);
        int[][] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(6, Arrays.stream(result[0]).sum());
    }

}