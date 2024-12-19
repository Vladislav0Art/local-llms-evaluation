package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsSpanOfOne {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSpanOfOne() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {10};
        int[] expected = {1};
        int[] actual = span.calculateSpans(prices);
        assertThat(actual[0], is(expected[0]));
    }

}