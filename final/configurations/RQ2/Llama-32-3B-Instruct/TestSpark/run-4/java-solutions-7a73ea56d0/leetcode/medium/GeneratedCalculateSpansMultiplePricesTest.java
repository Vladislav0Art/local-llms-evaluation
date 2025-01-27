package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedCalculateSpansMultiplePricesTest {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpansMultiplePricesTest() {
        int[] prices = {100, 80, 75, 90, 70, 60, 50};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3, 4, 5, 6, 7}, result);
    }

}