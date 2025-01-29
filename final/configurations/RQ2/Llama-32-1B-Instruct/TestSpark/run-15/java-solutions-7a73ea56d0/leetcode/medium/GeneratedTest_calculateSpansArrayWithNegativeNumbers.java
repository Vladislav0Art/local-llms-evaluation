package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpansArrayWithNegativeNumbers {

    @Test
    public void test_calculateSpansArrayWithNegativeNumbers() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-10, -20, -30};
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(-100));
        assertThrows(NullPointerException.class, () -> onlineStockSpan.calculateSpans(prices));
    }

}