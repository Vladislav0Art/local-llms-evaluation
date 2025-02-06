package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedTest {

    @Test
    public void nextPriceIsLowerThanCurrentPrice_WhenNextPriceIsLessThanCurrentPrice_Returns1() {
        // given
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(1, nextPrice);
    }

    @Test
    public void nextPriceIsLowerThanCurrentPrice_WhenNextPriceIsGreaterThanCurrentPrice_Returns2() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(2, nextPrice);
    }

    @Test
    public void nextPriceIsEqualToCurrentPrice_WhenNextPriceIsEqualToCurrentPrice_Returns1() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(1, nextPrice);
    }

    @Test
    public void nextPriceIsGreaterThanOrEqualToCurrentPrice_WhenNextPriceIsGreaterThanOrEqualToCurrentPrice_Returns2() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int nextPrice = stockSpan.next(6);

        // then
        assertEquals(2, nextPrice);
    }

    @Test
    public void calculateSpansForPricesWithOneElement_WhenInputArrayContainsOnlyOneElement_ReturnsCorrectResult() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10};

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpansForPricesWithMultipleElements_WhenInputArrayContainsMultipleElements_ReturnsCorrectResult() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {10, 7, 5, 8, 11, 9};

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertEquals(6, result.length);
    }

    @Test
    public void calculateSpansForPricesWithMultipleElements_WhenInputArrayContainsNegativeNumbers_ReturnsCorrectResult() {
        // given
        OnlineStockSpan stockSpan = new OnlineStack();
        int[] prices = {-10, 7, 5, 8, 11, 9};

        // when
        int[] result = stockSpan.calculateSpans(prices);

        // then
        assertEquals(6, result.length);
    }
}

class OnlineStockSpan {
    private Stack<Integer> stack;

    public OnlineStockSpan() {
        this.stack = new Stack<>();
    }

    public int next(int price) {
        while (!stack.isEmpty()) {
            if (price > stack.peek()) {
                break;
            } else {
                stack.pop();
            }
        }
        stack.push(price);
        return stack.size();
    }

    public int[] calculateSpans(int[] prices) {
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            int currentSpan = next(prices[i]);
            result[i] = currentSpan;
        }
        return result;
    }
}

}