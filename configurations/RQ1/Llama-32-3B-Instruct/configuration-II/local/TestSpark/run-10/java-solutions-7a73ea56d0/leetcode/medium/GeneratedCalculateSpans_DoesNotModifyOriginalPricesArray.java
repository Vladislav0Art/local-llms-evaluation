package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans_DoesNotModifyOriginalPricesArray {

    @Test
    public void calculateSpans_DoesNotModifyOriginalPricesArray() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {7, 4};
        for (int price : prices) {
            span.next(price);
        }
        assertThat(prices[0], is(7));
        assertThat(prices[1], is(4));
    }

}