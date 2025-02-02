package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_MockStackReturnsCorrectResult {

    @Test
    public void calculateSpans_MockStackReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.pop()).thenReturn(0);
        int[] prices = {100};
        int[] expectedSpans = {1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedSpans, result);
    }

}