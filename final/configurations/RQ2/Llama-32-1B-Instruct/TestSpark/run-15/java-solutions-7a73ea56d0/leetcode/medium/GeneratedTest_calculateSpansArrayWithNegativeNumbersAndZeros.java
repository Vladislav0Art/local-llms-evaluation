package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTest_calculateSpansArrayWithNegativeNumbersAndZeros {

    @Test
    public void test_calculateSpansArrayWithNegativeNumbersAndZeros() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {-10, -20, 30};
        assertThrows(NullPointerException.class, () -> onlineStockSpan.next(-100));
        assertThrows(NullPointerException.class, () -> onlineStockSpan.calculateSpans(prices));
    }

}