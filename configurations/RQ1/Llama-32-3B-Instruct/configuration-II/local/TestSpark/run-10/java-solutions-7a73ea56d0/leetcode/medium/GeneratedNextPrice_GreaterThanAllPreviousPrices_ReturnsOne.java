package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice_GreaterThanAllPreviousPrices_ReturnsOne {

    @Test
    public void nextPrice_GreaterThanAllPreviousPrices_ReturnsOne() {
        OnlineStockSpan span = new OnlineStockSpan();
        int price = 10;
        int expected = 1;
        int actual = span.next(price);
        assertThat(actual, is(expected));
    }

}