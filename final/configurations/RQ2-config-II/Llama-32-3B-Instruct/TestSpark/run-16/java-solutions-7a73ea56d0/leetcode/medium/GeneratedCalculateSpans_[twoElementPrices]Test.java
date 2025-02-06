package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[twoElementPrices]

Test {

    @Test
    public void calculateSpans_[ twoElementPrices]Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {1, 2};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{2, 3}, result);
    }

}