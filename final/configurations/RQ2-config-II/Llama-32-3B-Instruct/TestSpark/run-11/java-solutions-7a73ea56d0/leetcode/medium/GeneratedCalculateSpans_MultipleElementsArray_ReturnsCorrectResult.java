package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectResult {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectResult() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = solution.calculateSpans(prices);
        assertThat(result, is(ints(1, 2, 1, 2, 3, 2)));
    }

}