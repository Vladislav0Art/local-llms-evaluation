package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedCalculateSpansSingleElement {

    public OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpansSingleElement() {
        int[] prices = {100};
        int[] expected = new int[]{1};
        Arrays.copy(expected, solution.calculateSpans(prices));
    }

}