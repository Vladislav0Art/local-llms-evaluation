package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsSingleElementArray {

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSingleElementArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = solution.calculateSpans(prices);
        assertThat(result, is(ints(1)));
    }

}