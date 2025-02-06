package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedCalculateSpansMultipleElementsArrayTest {

    @Test
    public void calculateSpansMultipleElementsArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {3, 2, 1, 4, 5};
        int[] expected = {1, 1, 2, 3, 4};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}