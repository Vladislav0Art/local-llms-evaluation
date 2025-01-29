package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_multiplePrices_withZero {

    @Test
    public void test_calculateSpans_multiplePrices_withZero() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int[] prices = new int[]{price, 0, 20};
        int[] expected = {1, 2};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}