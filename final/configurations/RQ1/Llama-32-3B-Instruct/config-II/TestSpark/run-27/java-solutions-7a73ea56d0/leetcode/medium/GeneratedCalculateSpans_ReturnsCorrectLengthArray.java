package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_ReturnsCorrectLengthArray {

    @Test
    public void calculateSpans_ReturnsCorrectLengthArray() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result.length, is(3));
    }

}