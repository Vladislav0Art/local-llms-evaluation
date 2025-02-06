package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_MockStackToReturnCorrectResultForSecondPrice {

    @Test
    public void next_MockStackToReturnCorrectResultForSecondPrice() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(90)).thenReturn(true);
        int result = s.next(90, stack);
        assertEquals(1, result);
    }

}