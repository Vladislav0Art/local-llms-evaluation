package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans returnsCorrectArrayWithNegativePrices {

    @Test
    public void calculateSpans

    returnsCorrectArrayWithNegativePrices() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {-1, -2, -3};
        int[] expectedSpans = {-1, -1, -1};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertThat(actualSpans[i], is(expectedSpans[i]));
        }
    }

}