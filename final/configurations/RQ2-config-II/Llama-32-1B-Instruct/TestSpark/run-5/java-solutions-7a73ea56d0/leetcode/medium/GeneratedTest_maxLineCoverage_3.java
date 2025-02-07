package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_maxLineCoverage_3 {

    @Test
    public void test_maxLineCoverage_3() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {7, 9, 4, 1, 6, 3};
        int expected[] = {0, 8, 10, 12, 16, 13};
        assertEquals(expected, stock.calculateSpans(prices));
    }

}