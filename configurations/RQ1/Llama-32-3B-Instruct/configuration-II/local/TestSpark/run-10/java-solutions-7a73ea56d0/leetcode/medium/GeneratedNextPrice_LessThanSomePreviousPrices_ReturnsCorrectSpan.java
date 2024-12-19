package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice_LessThanSomePreviousPrices_ReturnsCorrectSpan {

    @Test
    public void nextPrice_LessThanSomePreviousPrices_ReturnsCorrectSpan() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {7, 4, 3};
        for (int price : prices) {
            span.next(price);
        }
        int[] spans = span.calculateSpans(prices);
        assertThat(spans[2], is(1));
    }

}