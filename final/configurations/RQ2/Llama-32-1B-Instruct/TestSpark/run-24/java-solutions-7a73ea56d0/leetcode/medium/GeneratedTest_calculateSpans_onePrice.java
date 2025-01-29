package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_onePrice {

    @Test
    public void test_calculateSpans_onePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int[] prices = new int[]{price};
        int[] expected = {1};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}