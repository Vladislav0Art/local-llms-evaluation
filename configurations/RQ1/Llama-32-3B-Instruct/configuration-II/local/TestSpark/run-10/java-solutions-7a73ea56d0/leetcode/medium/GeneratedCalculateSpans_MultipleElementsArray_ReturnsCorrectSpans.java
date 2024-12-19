package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectSpans() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {7, 4, 3, 10, 2};
        int[] expected = {1, 1, 1, 3, 1};
        int[] actual = span.calculateSpans(prices);
        for (int i = 0; i < prices.length; i++) {
            assertThat(actual[i], is(expected[i]));
        }
    }

}