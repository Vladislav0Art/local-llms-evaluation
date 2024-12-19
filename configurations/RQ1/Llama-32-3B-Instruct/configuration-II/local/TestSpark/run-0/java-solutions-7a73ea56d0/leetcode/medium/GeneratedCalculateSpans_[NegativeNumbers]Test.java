package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[NegativeNumbers]

Test {

    @Test
    public void calculateSpans_[ NegativeNumbers]Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {-1, -2, -3, -4, -5};
        int[] expected = {1, 1, 1, 1, 1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}