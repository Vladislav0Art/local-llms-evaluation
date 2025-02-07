package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_maxLineCoverage_1 {

    @Test
    public void test_maxLineCoverage_1() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {7, 6, 4, 3, 1};
        int expected[] = {0, 1, 2, 3, 4};
        assertEquals(expected, stock.calculateSpans(prices));
    }

}