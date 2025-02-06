package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[singleElementPrices]

Test {

    @Test
    public void calculateSpans_[ singleElementPrices]Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10};
        int[] result = solution.calculateSpans(prices);
        assertArrayEquals(new int[]{1}, result);
    }

}