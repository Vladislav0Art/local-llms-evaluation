package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice_MockStackToReturnCorrectSpan {

    @Test
    public void nextPrice_MockStackToReturnCorrectSpan() throws Exception {
        Mockery mockery = new Mockery();
        Stack<Integer> stack = mockery.mock(Stack.class);
        OnlineStockSpan span = new OnlineStockSpan();
        span.indexStack = stack;
        int price = 7;
        int expected = 1;
        int actual = span.next(price);
        assertThat(actual, is(expected));
    }

}