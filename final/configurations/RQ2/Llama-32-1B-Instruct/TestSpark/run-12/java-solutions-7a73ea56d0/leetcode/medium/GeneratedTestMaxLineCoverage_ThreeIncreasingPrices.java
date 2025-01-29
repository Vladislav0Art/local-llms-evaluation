package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class GeneratedTestMaxLineCoverage_ThreeIncreasingPrices {

    @Test
    public void testMaxLineCoverage_ThreeIncreasingPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price1 = 10;
        int price2 = 20;
        int price3 = 30;
        assertEquals(0, onlineStockSpan.calculateSpans(new int[]{price1, price2, price3}));
    }

}