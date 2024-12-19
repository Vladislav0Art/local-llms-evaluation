package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedCalculateSpansAllElementsSame {

    public OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void calculateSpansAllElementsSame() {
        int[] prices = {100, 100, 100};
        int[] expected = new int[]{3, 2, 1};
        Arrays.copy(expected, solution.calculateSpans(prices));
    }

}