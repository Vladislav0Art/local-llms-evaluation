package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_multiplePrices {

    @Test
    public void test_calculateSpans_multiplePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        int[] prices = new int[]{price, price + 20};
        int[] expected = {2};
        int[] actual = onlineStockSpan.calculateSpans(prices);
        assertEquals(expected, actual);
    }

}