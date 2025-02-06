package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedCalculateSpans_[givenPrices1_2_3_4_5]

ShouldReturnArrayWithCorrectSpans {

    @Test
    public void calculateSpans_[ givenPrices1_2_3_4_5]ShouldReturnArrayWithCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1, 2, 3, 4, 5};
        int[] result = solution.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[(1, 1), (2, 2), (3, 3), (4, 4), (5, 5)]"));
    }

}