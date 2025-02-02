package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[]

MixedIntegersTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_[] MixedIntegersTest() {
        int[] prices = {-3, 0, 2, 10, -20, 50};
        int[] expected = {1, 1, 2, 6, 8, 9};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}