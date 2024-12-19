package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans_MockStackToReturnCorrectSpans {

    @Test
    public void calculateSpans_MockStackToReturnCorrectSpans() throws Exception {
        Mockery mockery = new Mockery();
        Stack<Integer> stack = mockery.mock(Stack.class);
        OnlineStockSpan span = new OnlineStockSpan();
        span.indexStack = stack;
        int[] prices = {7, 4};
        for (int price : prices) {
            span.next(price);
        }
        int[] expected = {1, 1};
        int[] actual = span.calculateSpans(prices);
        assertThat(actual[0], is(expected[0]));
    }

}