package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans returnsCorrectArrayWithDuplicates {

    @Test
    public void calculateSpans

    returnsCorrectArrayWithDuplicates() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {2, 1, 3, 4};
        int[] expectedSpans = {2, 2, 3, 4};
        int[] actualSpans = stockSpan.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertThat(actualSpans[i], is(expectedSpans[i]));
        }
    }

}