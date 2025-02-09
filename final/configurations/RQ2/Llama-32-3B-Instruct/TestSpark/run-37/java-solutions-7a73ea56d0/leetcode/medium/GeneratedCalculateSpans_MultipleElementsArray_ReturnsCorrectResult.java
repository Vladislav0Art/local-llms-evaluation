package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectResult {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectResult() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 70, 60, 95};
        int[][] result = solution.calculateSpans(prices);
        assertThat(result.length, is(6));
        for (int i = 0; i < result.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < prices.length; j++) {
                if (!stack.isEmpty() && prices[j] >= result[i][0]) {
                    int span = j - ((Stack) solution.calculateSpans(prices)).pop();
                    result[i][1] += span;
                }
                stack.push(j);
            }
        }
    }

}