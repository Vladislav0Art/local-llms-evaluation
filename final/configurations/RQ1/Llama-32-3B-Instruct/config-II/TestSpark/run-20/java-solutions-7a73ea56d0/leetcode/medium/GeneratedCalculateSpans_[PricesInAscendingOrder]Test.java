package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[PricesInAscendingOrder]

Test {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_[ PricesInAscendingOrder]Test() {
        int[] prices = {5, 7, 11, 8, 9};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3, 1, 1}, result);
    }

}