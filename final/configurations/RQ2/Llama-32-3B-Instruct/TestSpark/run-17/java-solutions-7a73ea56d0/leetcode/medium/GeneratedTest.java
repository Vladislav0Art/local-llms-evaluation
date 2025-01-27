package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

import org.mockito.Mockito;

public class GeneratedTest {

    @Test
    public void nextPrice_WithoutStack_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertThat(result, is(1));
    }

    @Test
    public void nextPrice_IsSamePrice_Returns1() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(100);
        assertThat(result, is(1));
    }

    @Test
    public void nextPrice_DifferentPrices_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(150);
        assertThat(result, is(2));
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] result = stockSpan.calculateSpans(new int[0]);
        assertThat(result.length, is(0));
    }

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectSpan() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = stockSpan.calculateSpans(prices);
        assertThat(result[0], is(1));
    }

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        int[] result = stockSpan.calculateSpans(prices);
        assertThat(result[0], is(1));
        assertThat(result[1], is(2));
        assertThat(result[2], is(3));
        assertThat(result[3], is(4));
    }

    @Test
    public void nextPrice_IsSameSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        for (int price : prices) {
            int result = stockSpan.next(price);
            assertThat(result, is(stockSpan.calculateSpans(new int[]{price})));
        }
    }

    @Test
    public void nextPrice_MultipleSamePrices_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            int result = stockSpan.next(100);
            assertThat(result, is(i + 1));
        }
    }

    @Test
    public void calculateSpans_IsCorrectSequence_ReturnsCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        for (int i = 0; i < prices.length - 1; i++) {
            int result = stockSpan.calculateSpans(new int[]{prices[i], prices[i + 1]});
            assertThat(result[0], is(1));
            assertThat(result[1], is(2));
        }
    }

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