package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_next_2 {

    @Test
    public void test_next_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            onlineStockSpan.next(i + 1);
        }
        int[] prices = {100, 200, 300, 400, 500};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(5, Arrays.stream(result).sum());
    }

}