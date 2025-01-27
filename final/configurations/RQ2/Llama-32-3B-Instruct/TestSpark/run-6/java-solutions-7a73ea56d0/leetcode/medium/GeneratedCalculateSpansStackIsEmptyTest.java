package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansStackIsEmptyTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
    private Stack<Integer> stack = new Stack<>();

    @Test
    public void calculateSpansStackIsEmptyTest() {
        stack.clear();
        when(onlineStockSpan.next(5)).thenReturn(4);
        onlineStockSpan.calculateSpans(new int[]{10, 15});
    }
}

public class OnlineStockSpan {
    private Stack<Integer> stack = new Stack<>();

    public int next(int price) {
        if (stack.isEmpty()) {
            return stack.push(price) + 1;
        } else {
            int top = stack.peek();
            stack.pop();
            return top + 1;
        }
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = onlineStockSpan.next(prices[i]);
        }
        return result;
    }

}