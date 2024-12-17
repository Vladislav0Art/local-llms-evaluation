package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansCorrectlyForMultipleElements {

    @Test
    public void calculateSpansCorrectlyForMultipleElements() {
        int[] prices = {10, 20, 5};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result[0], is(1));
        assertThat(result[1], is(2));
        assertThat(result[2], is(1));
    }

}