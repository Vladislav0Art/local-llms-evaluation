package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice_DoesNotChangeListWhenIndexStackIsNotEmpty {

    @Test
    public void nextPrice_DoesNotChangeListWhenIndexStackIsNotEmpty() {
        OnlineStockSpan span = new OnlineStockSpan();
        int price = 5;
        int[] prices = {10, 4};
        for (int p : prices) {
            span.next(p);
        }
        assertThat(span.list.size(), is(2));
    }

}