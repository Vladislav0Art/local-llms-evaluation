package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Stack;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    private int index = 0;
    public Stack<Integer> stack;

    public int next(int price) {
        if (stack.isEmpty()) {
            stack.push(index);
            return index + 1;
        } else {
            while (!stack.isEmpty() && stack.peek() <= price) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                stack.push(index);
                return index + 1;
            } else {
                stack.push(index);
                return index - stack.peek() + 1;
            }
        }
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            result[i] = next(prices[i]);
        }
        return result;
    }
}

public class GeneratedTest {

    @org.junit.Before
    public void setup() {
        // empty
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result.length, is(0));
    }

}