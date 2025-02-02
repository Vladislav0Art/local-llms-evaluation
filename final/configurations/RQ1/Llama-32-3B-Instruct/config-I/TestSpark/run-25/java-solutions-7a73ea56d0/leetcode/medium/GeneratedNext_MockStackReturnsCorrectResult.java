package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_MockStackReturnsCorrectResult {

    @Test
    public void next_MockStackReturnsCorrectResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.pop()).thenReturn(0);
        int result = onlineStockSpan.next(100);
        assertEquals(1, result);
    }

}