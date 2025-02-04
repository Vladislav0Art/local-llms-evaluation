package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyLengthArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyLengthArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result.length, is(0));
    }

}