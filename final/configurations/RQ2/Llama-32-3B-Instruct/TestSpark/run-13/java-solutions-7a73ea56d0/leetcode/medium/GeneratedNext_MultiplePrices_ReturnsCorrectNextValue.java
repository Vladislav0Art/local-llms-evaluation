package leetcode.medium;

import java.util.*;

public class GeneratedNext_MultiplePrices_ReturnsCorrectNextValue {

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
    public void next_MultiplePrices_ReturnsCorrectNextValue() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int i = 1; i < prices.length; i++) {
            int result = instance.next(prices[i - 1]);
            assertEquals(result + 1, instance.next(0));
        }
    }

}