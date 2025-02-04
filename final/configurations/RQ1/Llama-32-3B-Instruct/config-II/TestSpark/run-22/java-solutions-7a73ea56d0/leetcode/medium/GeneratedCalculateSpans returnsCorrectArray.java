package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans returnsCorrectArray {

    @Test
    public void calculateSpans

    returnsCorrectArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4};
        int[] expectedSpans = {1, 2, 3, 4};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertThat(actualSpans[i], is(expectedSpans[i]));
        }
    }

}