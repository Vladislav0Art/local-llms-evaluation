package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestMaxLineCoverage_NegativePrices {

    @Test
    public void testMaxLineCoverage_NegativePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = -10;
        int[] prices = {-20, -30};
        assertEquals(0, onlineStockSpan.calculateSpans(prices));
    }

}