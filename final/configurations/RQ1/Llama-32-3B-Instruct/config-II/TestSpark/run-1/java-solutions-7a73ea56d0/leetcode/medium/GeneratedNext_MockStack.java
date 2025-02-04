package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_MockStack {

    @Test
    public void next_MockStack() {
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.isEmpty()).thenReturn(true);
        when(stack.pop()).thenReturn(0);

        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int price = 10;
        onlineStockSpan.list.add(price);
        onlineStockSpan.next(price);

        assertEquals(1, ((Stack<Integer>) stack).peek());
    }

}