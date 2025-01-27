package leetcode.medium;

import java.util.*;

public class GeneratedCalculateSpans_SinglePrice_ReturnsSingleElementArray {

    public int next(int price) {
        return 1;
    }

    public int[] calculateSpans(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = i + 1;
            } else {
                result[i] = i - stack.peek() + 1;
            }
            stack.push(i);
        }
        return result;
    }

}

public class OnlineStockSpanTest {

    @Test
    public void calculateSpans_SinglePrice_ReturnsSingleElementArray() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = instance.calculateSpans(prices);
        assertEquals(1, result.length);
        assertEquals(10, result[0]);
    }

}