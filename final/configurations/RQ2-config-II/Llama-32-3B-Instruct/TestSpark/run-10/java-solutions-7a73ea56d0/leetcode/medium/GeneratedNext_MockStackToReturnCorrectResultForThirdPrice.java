package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext_MockStackToReturnCorrectResultForThirdPrice {

    @Test
    public void next_MockStackToReturnCorrectResultForThirdPrice() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(75)).thenReturn(true);
        int result = s.next(75, stack);
        assertEquals(2, result);
    }

}