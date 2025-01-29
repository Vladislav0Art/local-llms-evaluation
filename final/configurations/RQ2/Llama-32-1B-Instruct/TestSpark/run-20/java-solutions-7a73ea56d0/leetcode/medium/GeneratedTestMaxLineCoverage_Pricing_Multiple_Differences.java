package leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedTestMaxLineCoverage_Pricing_Multiple_Differences {

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
    public void testMaxLineCoverage_Pricing_Multiple_Differences() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {100, 200, 300, 400};
        int[] result = instance.calculateSpans(prices);
        for (int i = 0; i < result.length; i++) {
            System.out.println("Max Line Coverage at Index " + i + ": " + result[i]);
        }
    }

}