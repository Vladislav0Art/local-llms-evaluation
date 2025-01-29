package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_calculateSpans_5 {

    @Test
    public void test_calculateSpans_5() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 200};
        onlineStockSpan.next(1);
        onlineStockSpan.next(2);
        int[][] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(3, Arrays.stream(result[0]).sum());
    }

}