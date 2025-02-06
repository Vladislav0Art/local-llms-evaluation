package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_MultipleDuplicateElementsArray_ReturnsCumulativeSum {

    @Test
    public void calculateSpans_MultipleDuplicateElementsArray_ReturnsCumulativeSum() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 7, 5, 8, 11, 9, 7, 5};
        int[] result = solution.calculateSpans(prices);
        assertThat(result, is(ints(1, 2, 1, 2, 3, 2, 1, 1)));
    }
}

}