package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansStackingCorrectly {

    @Test
    public void calculateSpansStackingCorrectly() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Stack<Integer> stack = new Stack<>();
        int[] prices = {10, 5, -3, -2, 1};
        for (int price : prices) {
            int span = onlineStockSpan.next(price);
            assertEquals(span + 1, stack.size());
            if (!stack.isEmpty()) {
                assertEquals(stack.peek() + span + 1, stack.get(stack.size() - 1));
            }
        }
    }

}