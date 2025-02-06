package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNextPriceStackingCorrectly {

    @Test
    public void nextPriceStackingCorrectly() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Stack<Integer> stack = new Stack<>();
        int[] prices = {10, 5, -3, -2, 1};
        for (int price : prices) {
            onlineStockSpan.next(price);
            assertEquals(stack.size(), onlineStockSpan.calculateSpans(new int[]{prices[0]}).length);
        }
    }

}