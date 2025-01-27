package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedCalculateSpans_ReturnsCorrectArray_WhenEmptyPrices {

    @Test
    public void calculateSpans_ReturnsCorrectArray_WhenEmptyPrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expectedSpans = {};
        onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.equals(onlineStockSpan.calculateSpans(prices), expectedSpans), is(true));
    }

}