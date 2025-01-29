package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpansEmptyArray {

    @Test
    public void test_calculateSpansEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(100));
        assertThrows(NullPointerException.class, () -> onlineStockSpan.calculateSpans(prices));
    }

}