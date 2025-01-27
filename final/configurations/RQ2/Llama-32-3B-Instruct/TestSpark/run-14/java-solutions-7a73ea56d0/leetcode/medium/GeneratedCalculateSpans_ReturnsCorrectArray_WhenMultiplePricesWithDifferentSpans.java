package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedCalculateSpans_ReturnsCorrectArray_WhenMultiplePricesWithDifferentSpans {

    @Test
    public void calculateSpans_ReturnsCorrectArray_WhenMultiplePricesWithDifferentSpans() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10, 9, 8, 7};
        int[] expectedSpans = {3, 2, 1, 1};
        onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.equals(onlineStockSpan.calculateSpans(prices), expectedSpans), is(true));
    }

}