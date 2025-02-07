package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_maxLineCoverage_2 {

    @Test
    public void test_maxLineCoverage_2() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {10, 5, 15, 20};
        int expected[] = {1, 6, 19, 100};
        assertEquals(expected, stock.calculateSpans(prices));
    }

}