package leetcode.medium;

import java.util.*;

public class GeneratedNext_SinglePrice_ReturnsSingleElement {

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
    public void next_SinglePrice_ReturnsSingleElement() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 10;
        int result = instance.next(price);
        assertEquals(1, result);
    }

}