package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_MockStackToReturnCorrectResultForFourthPrice {

    @Test
    public void next_MockStackToReturnCorrectResultForFourthPrice() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(60)).thenReturn(true);
        int result = s.next(60, stack);
        assertEquals(3, result);
    }

}