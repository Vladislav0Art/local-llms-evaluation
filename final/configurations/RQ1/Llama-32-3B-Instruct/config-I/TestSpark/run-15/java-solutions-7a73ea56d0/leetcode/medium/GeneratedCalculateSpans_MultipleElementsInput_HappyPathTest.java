package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedCalculateSpans_MultipleElementsInput_HappyPathTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsInput_HappyPathTest() {
        int[] prices = {100, 50, 40, 30, 20, 10};
        int[] expected = {1, 2, 3, 4, 5, 6};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}