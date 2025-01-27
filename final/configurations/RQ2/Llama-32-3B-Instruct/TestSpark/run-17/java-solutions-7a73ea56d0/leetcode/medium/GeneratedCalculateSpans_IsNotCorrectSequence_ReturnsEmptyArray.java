package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_IsNotCorrectSequence_ReturnsEmptyArray {

    @Test
    public void calculateSpans_IsNotCorrectSequence_ReturnsEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        for (int i = 0; i < prices.length - 1; i++) {
            int result = stockSpan.calculateSpans(new int[]{prices[i + 1], prices[i]});
            assertThat(result.length, is(0));
        }
    }

}

public class OnlineStockSpan {

    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new Stack<>();
    }

    public int next(int price) {
        if (!stack.isEmpty()) {
            while (!stack.isEmpty() && stack.peek() <= price) {
                stack.pop();
            }
            return stack.isEmpty() ? 1 : stack.peek() + 1;
        } else {
            return 1;
        }
    }

    public int[] calculateSpans(int[] prices) {
        int n = prices.length;
        int[] result = new int[n];
        stack.clear();
        for (int i = 0; i < n; i++) {
            result[i] = next(prices[i]);
            stack.push(prices[i]);
        }
        return result;
    }

}