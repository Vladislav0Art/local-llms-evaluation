package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementArray_Returns2DArrayWithCorrectValue {

    @Test
    public void calculateSpans_SingleElementArray_Returns2DArrayWithCorrectValue() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1};
        int[][] result = solution.calculateSpans(prices);
        assertThat(result.length, is(1));
        assertThat(result[0].length, is(2));
        assertThat(result[0][0], is(1));
        assertThat(result[0][1], is(1));
    }

}