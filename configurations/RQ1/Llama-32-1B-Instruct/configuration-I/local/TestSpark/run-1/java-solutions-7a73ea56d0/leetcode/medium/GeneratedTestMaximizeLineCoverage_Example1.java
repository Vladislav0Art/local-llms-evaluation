package leetcode.medium;

import org.junit.Test;

public class GeneratedTestMaximizeLineCoverage_Example1 {

    public static int[] calculateSpans(int[] prices) {
        if (prices.length < 2) {
            return new int[0];
        }

        int[] result = new int[prices.length - 1];
        for (int i = 1; i < prices.length; i++) {
            int span = 1;
            while (i > 1 && prices[i] >= prices[i - 1]) {
                span += 1;
                i -= 1;
            }
            result[i - 2] = span;
        }

        return result;
    }

    public static void printResult(int[] result) {
        System.out.println("Span of first element is " + result[0]);
    }

    @Test
    public void testMaximizeLineCoverage_Example1() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 2, 6, 5, 0, 9, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        printResult(result); // Print the first element span
    }

}