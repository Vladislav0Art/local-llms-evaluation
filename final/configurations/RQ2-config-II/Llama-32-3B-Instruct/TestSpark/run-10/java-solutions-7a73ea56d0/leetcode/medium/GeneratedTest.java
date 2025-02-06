package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedTest {

    @Test
    public void next_SinglePrice_ReturnsOne() {
        OnlineStockSpan s = new OnlineStockSpan();
        int result = s.next(100);
        assertEquals(1, result);
    }

    @Test
    public void next_DuplicatePrices_ReturnsSameAsLast() {
        OnlineStockSpan s = new OnlineStockSpan();
        int result = s.next(100);
        int result2 = s.next(100);
        assertEquals(result2, 1);
    }

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{});
        assertEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpans_SinglePrice_ReturnsOneElementArrayWithOneElement() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{100});
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_DuplicatePrices_ReturnCorrectSpans() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] prices = {100, 90, 75, 60};
        int[] result = s.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4}, result);
    }

    @Test
    public void next_MockStackToReturnCorrectResult() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(100)).thenReturn(true);
        int result = s.next(100, stack);
        assertEquals(1, result);
    }

    @Test
    public void next_MockStackToReturnCorrectResultForSecondPrice() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(90)).thenReturn(true);
        int result = s.next(90, stack);
        assertEquals(1, result);
    }

    @Test
    public void next_MockStackToReturnCorrectResultForThirdPrice() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(75)).thenReturn(true);
        int result = s.next(75, stack);
        assertEquals(2, result);
    }

    @Test
    public void next_MockStackToReturnCorrectResultForFourthPrice() {
        OnlineStockSpan s = new OnlineStockSpan();
        Stack<Integer> stack = Mockito.mock(Stack.class);
        when(stack.push(60)).thenReturn(true);
        int result = s.next(60, stack);
        assertEquals(3, result);
    }

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