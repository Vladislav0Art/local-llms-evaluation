package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpans_onePrice {

    @Test
    public void test_calculateSpans_onePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 100;
        int[] expected = new int[1];
        expected[0] = 1;
        assertEquals(expected, onlineStockSpan.calculateSpans(new int[]{price}));
    }

}