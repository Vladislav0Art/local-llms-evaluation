package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectLengthArray {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectLengthArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result.length, is(1));
    }

}