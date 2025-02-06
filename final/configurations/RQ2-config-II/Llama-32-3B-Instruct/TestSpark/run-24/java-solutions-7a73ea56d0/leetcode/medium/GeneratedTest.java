package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

import java.util.Stack;

import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.Arrays;

import org.mockito.Mockito;

@RunWith(JUnit4.class)
public class GeneratedTest {

    @Test
    public void next_ReturnsOneWhenPriceIsZero() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(0);
        assertThat(result, is(1));
    }

    @Test
    public void next_ReturnsOneWhenPriceIsNegative() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(-1000);
        assertThat(result, is(1));
    }

    @Test
    public void next_ReturnsPricePlusOneWhenPriceIsPositive() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(1000);
        assertThat(result, is(1001));
    }

    @Test
    public void calculateSpans_CalculateCorrectSpans() {
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        List<Integer> prices = Arrays.asList(-1000, 10, 20, -5, 10);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(3, result[0]);
        assertEquals(2, result[1]);
        assertEquals(4, result[2]);
    }

    @Test
    public void calculateSpans_CalculateCorrectSpansForNegativePrices() {
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        List<Integer> prices = Arrays.asList(-1000, -5, 10);
        int[] result = stockSpan.calculateSpans(prices);
        assertEquals(3, result[0]);
        assertEquals(2, result[1]);
    }

    @Test
    public void calculateSpans_ReturnsEmptyArrayForEmptyPricesList() {
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        List<Integer> prices = new ArrayList<>();
        int[] result = stockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{0}, result);
    }

    @Test
    public void next_MockStack_ReturnsCorrectValue() {
        Stack mockStack = Mockito.mock(Stack.class);
        when(mockStack.isEmpty()).thenReturn(true);

        OnlineStockSpan stockSpan = new OnlineStackSpan();
        stockSpan.stack = mockStack;
        int result = stockSpan.next(1000);
        assertEquals(result, 1001);
    }

    private static class OnlineStackSpan extends OnlineStockSpan {

        public Stack stack;

        @Override
        public int next(int price) {
            return newStack.size() + 1;
        }

        @Override
        public int[] calculateSpans(int[] prices) {
            List<Integer> result = new ArrayList<>();
            for (int i = 0; i < prices.length; i++) {
                result.add(calculateSpan(prices[i]));
            }
            return result.toArray(new Integer[0]);
        }

        private int calculateSpan(int price) {
            if (stack.isEmpty()) {
                stack.push(price);
                return 1;
            } else {
                while (!stack.isEmpty() && stack.peek() <= price) {
                    stack.pop();
                }
                return stack.size() + 1;
            }
        }

        @Override
        public int next(int price) {
            if (price < 0)
                return 1;
            return newStack.size() + 1;
        }
    }

}