package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpansArrayWithZeroes {

    @Test
    public void test_calculateSpansArrayWithZeroes() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {0, 1, 2};
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(0));
        assertThrows(NullPointerException.class, () -> onlineStockSpan.calculateSpans(prices));
    }

}