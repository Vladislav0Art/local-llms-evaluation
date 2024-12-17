package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultipleConsecutiveDecreases_DeterministicResult {

    @Test
    public void calculateSpans_MultipleConsecutiveDecreases_DeterministicResult() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4, 3, 2, 1};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertThat(result[0], is(1));
        assertThat(result[1], is(1));
        assertThat(result[2], is(2));
        assertThat(result[3], is(3));
        assertThat(result[4], is(5));
    }

}