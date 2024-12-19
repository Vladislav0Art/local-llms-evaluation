package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedCalculateSpansMultipleElements {

    public OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpansMultipleElements() {
        int[] prices = {100, 80, 110};
        int[] expected = new int[]{2, 1, 3};
        Arrays.copy(expected, solution.calculateSpans(prices));
    }

}