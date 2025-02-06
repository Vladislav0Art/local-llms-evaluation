package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedCalculateSpans_[givenPrices1_2_1_3_6]

ShouldReturnArrayWithCorrectSpans {

    @Test
    public void calculateSpans_[ givenPrices1_2_1_3_6]ShouldReturnArrayWithCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1, 2, 1, 3, 6};
        int[] result = solution.calculateSpans(prices);
        assertThat(Arrays.toString(result), is("[(1, 1), (2, 2), (1, 1), (3, 4), (6, 5)]"));
    }

}