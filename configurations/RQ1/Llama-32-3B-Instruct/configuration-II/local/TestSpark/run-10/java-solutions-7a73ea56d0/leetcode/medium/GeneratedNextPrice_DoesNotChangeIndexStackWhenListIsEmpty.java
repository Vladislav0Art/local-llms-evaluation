package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice_DoesNotChangeIndexStackWhenListIsEmpty {

    @Test
    public void nextPrice_DoesNotChangeIndexStackWhenListIsEmpty() {
        OnlineStockSpan span = new OnlineStockSpan();
        int price = 5;
        int[] prices = {};
        for (int p : prices) {
            span.next(p);
        }
        assertThat(span.indexStack.size(), is(0));
    }

}