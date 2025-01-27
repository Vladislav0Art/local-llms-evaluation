package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;

public class GeneratedCalculateSpans_ReturnsCorrectArray_WhenSinglePrice {

    @Test
    public void calculateSpans_ReturnsCorrectArray_WhenSinglePrice() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {10};
        int[] expectedSpans = {1};
        onlineStockSpan.calculateSpans(prices);
        assertThat(Arrays.equals(onlineStockSpan.calculateSpans(prices), expectedSpans), is(true));
    }

}