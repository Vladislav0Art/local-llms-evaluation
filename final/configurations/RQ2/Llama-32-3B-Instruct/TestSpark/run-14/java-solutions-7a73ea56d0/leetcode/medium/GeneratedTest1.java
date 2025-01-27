package leetcode.medium;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class GeneratedTest1 {

    @Test
    public void test1() {
        Stack<Integer> stack = new Stack<>();
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan(stack);

        onlineStockSpan.push(10);
        onlineStockSpan.push(7);
        onlineStockSpan.push(5);

        Stack<Integer> nextSpy = spy(new Stack<>());
        onlineStockSpan.next = nextSpy;
        verify(nextSpy).push(1);
        verify(nextSpy).push(1);
        verify(nextSpy).push(2);
    }

}