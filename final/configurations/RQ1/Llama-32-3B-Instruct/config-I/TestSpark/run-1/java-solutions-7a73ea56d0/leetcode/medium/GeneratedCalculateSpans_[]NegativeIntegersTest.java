package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[]

NegativeIntegersTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_[] NegativeIntegersTest() {
        int[] prices = {-5, -10, -20, -30, -40};
        int[] expected = {1, 2, 3, 4, 5};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}