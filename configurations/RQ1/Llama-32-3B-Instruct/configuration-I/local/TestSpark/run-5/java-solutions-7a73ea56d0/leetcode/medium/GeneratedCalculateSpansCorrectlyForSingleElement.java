package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class GeneratedCalculateSpansCorrectlyForSingleElement {

    @Test
    public void calculateSpansCorrectlyForSingleElement() {
        int[] prices = {10};
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result[0], is(1));
    }

}