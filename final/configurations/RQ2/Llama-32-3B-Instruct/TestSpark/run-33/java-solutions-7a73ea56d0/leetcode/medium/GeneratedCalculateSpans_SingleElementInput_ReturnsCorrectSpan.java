package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementInput_ReturnsCorrectSpan {

    public int next(int price) {
        return 1; // Stubbed implementation
    }

    public int[] calculateSpans(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        int[] result = new int[prices.length];
        for (int i = 0; i < prices.length; i++) {
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }
            if (stack.isEmpty()) {
                result[i] = 1;
            } else {
                result[i] = i - stack.peek() + 1;
            }
            stack.push(i);
        }
        return result;
    }

}

package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;

@RunWith(MockitoJUnitRunner.class)
public class OnlineStockSpanTest {

    @Mock
    private Stack<Integer> mockStack;

    public int[] calculateSpans(int[] prices) {
        return new OnlineStockSpan().calculateSpans(prices);
    }

    @Test
    public void calculateSpans_SingleElementInput_ReturnsCorrectSpan() {
        when(mockStack.pop()).thenReturn(1);
        int[] prices = {2};
        int[] result = calculateSpans(prices);
        assertEquals(1, result[0]);
    }

}