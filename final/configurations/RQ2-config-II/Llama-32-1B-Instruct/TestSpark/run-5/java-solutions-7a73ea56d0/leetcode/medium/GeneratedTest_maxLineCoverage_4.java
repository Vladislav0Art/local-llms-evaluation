package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeneratedTest_maxLineCoverage_4 {

    @Test
    public void test_maxLineCoverage_4() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5, 6, 7};
        int expected[] = {0, 2, 6, 18, 64, 230, 739};
        assertEquals(expected, stock.calculateSpans(prices));
    }

}