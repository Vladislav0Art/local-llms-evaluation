package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTestMaxLineCoverage_0 {

    private int[] maxLineCoverage = new int[prices.length + 1];

    public void next(int price) {
        if (price == 0) return;
        --maxLineCoverage[prices.length];
        ++maxLineCoverage[prices.length - 1];
    }

    public int[] calculateSpans(int[] prices) {
        for (int i = prices.length; i > 0; i--) {
            maxLineCoverage[i] += maxLineCoverage[i - 1];
            next(prices[i - 1]);
        }
        return maxLineCoverage;
    }

    @Test
    public void testMaxLineCoverage_0() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {0};
        try {
            instance.calculateSpans(prices);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
    }

}