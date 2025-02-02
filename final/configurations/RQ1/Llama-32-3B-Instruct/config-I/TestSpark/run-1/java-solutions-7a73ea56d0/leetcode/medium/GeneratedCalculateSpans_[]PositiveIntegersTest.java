package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[]

PositiveIntegersTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_[] PositiveIntegersTest() {
        int[] prices = {100, 80, 75, 70, 60, 70};
        int[] expected = {1, 2, 1, 2, 3, 4};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}