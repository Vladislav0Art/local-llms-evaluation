package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[MultipleElementPrices]

Test {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_[ MultipleElementPrices]Test() {
        int[] prices = {10, 7, 5, 8, 11, 9};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 2, 3, 4, 3}, result);
    }

}