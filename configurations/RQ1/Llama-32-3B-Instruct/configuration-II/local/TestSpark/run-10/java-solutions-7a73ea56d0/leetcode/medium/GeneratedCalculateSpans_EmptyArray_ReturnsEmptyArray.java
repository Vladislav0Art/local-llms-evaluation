package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        OnlineStockSpan span = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        int[] actual = span.calculateSpans(prices);
        assertThat(actual.length, is(expected.length));
    }

}