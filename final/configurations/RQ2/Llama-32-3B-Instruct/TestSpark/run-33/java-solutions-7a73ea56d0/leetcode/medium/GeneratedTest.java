package leetcode.medium;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

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
    public void calculateSpans_EmptyInput_ReturnsEmptyArray() {
        int[] result = calculateSpans(new int[0]);
        assert Arrays.equals(result, new int[0]);
    }

    @Test
    public void calculateSpans_SingleElementInput_ReturnsCorrectSpan() {
        when(mockStack.pop()).thenReturn(1);
        int[] prices = {2};
        int[] result = calculateSpans(prices);
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_MultipleElementsInput_ReturnsCorrectSpans() {
        when(mockStack.pop()).thenReturn(2);
        when(mockStack.push(2)).thenAnswer(x -> x.get());
        when(mockStack.push(1)).thenAnswer(x -> x.get());
        int[] prices = {2, 1};
        int[] result = calculateSpans(prices);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void calculateSpans_SameElementsInput_ReturnsCorrectSpans() {
        when(mockStack.push(5)).thenReturn(5);
        int[] prices = {5, 5};
        int[] result = calculateSpans(prices);
        assertEquals(2, result[0]);
        assertEquals(1, result[1]);
    }

    @Test
    public void calculateSpans_DuplicateElementsInput_ReturnsCorrectSpans() {
        when(mockStack.push(3)).thenReturn(3);
        int[] prices = {2, 3};
        int[] result = calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(1, result[1]);
    }

}