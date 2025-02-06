package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_MockStackToReturnCorrectResult {

    @Test
    public void next_MockStackToReturnCorrectResult() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(100)).thenReturn(true);
        int result = s.next(100, stack);
        assertEquals(1, result);
    }

}