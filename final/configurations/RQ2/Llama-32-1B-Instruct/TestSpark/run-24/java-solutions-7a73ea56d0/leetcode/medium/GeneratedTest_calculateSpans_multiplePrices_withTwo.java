package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_multiplePrices_withTwo {

    @Test
    public void test_calculateSpans_multiplePrices_withTwo() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = -10;
        int[] prices = new int[]{price, 0, 20, 30};
        int[] expected = {1, 2, 3};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}