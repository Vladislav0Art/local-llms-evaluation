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
public class GeneratedNext_MockStack_ReturnsCorrectValue {

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