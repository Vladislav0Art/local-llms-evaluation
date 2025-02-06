package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpans_MockStackToReturnCorrectResult {

    @Test
    public void calculateSpans_MockStackToReturnCorrectResult() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(100)).thenReturn(true);
        when(stack.push(90)).thenReturn(true);
        when(stack.push(75)).thenReturn(true);
        when(stack.push(60)).thenReturn(true);
        int[] prices = {100, 90, 75, 60};
        int[] result = s.calculateSpans(prices, stack);
        assertEquals(new int[]{1, 2, 3, 4}, result);
    }

}