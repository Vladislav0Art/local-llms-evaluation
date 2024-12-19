package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_[Isolation]

Test {

    @Test
    public void calculateSpans_[ Isolation]Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60};
        int[] expected = {1, 2, 3, 4};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}