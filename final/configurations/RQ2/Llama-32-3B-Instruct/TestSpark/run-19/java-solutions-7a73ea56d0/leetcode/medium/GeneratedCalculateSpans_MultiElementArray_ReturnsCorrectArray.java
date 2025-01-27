package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultiElementArray_ReturnsCorrectArray {

    @Test
    public void calculateSpans_MultiElementArray_ReturnsCorrectArray() {
        OnlineStackSpan onlineStockSpan = new OnlineStackSpan();
        int[] prices = {10, 20, 30};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertTrue(Arrays.equals(result, new int[]{1, 2, 3}));
    }

}

class OnlineStackSpan {
    private java.util.Stack<Integer> stack;

    public OnlineStackSpan() {
        this.stack = new java.util.Stack<>();
    }

    public int next(int price) {
        if (!stack.isEmpty()) {
            while (!stack.isEmpty() && (Integer) stack.peek() <= price)
                stack.pop();
        }
        stack.push(price);
        return stack.size();
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            if (!stack.isEmpty()) {
                while (!stack.isEmpty() && prices[i] >= (Integer) stack.peek())
                    stack.pop();
            }
            result[i] = stack.size();
            stack.push(prices[i]);
        }
        return result;
    }

}