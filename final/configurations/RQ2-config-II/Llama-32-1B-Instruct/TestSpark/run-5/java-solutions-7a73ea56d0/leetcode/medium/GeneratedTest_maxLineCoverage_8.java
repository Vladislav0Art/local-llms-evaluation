package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_maxLineCoverage_8 {

    @Test
    public void test_maxLineCoverage_8() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7};
        int expected = 1;
        assertEquals(expected, stock.calculateSpans(prices));
    }

}