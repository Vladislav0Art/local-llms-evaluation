package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedCalculateSpans_ReturnsCorrectArray_WhenMultiplePrices {

    @Test
    public void calculateSpans_ReturnsCorrectArray_WhenMultiplePrices() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 9, 8};
        int[] expectedSpans = {2, 1, 1};
        onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.equals(onlineStockSpan.calculateSpans(prices), expectedSpans), is(true));
    }

}