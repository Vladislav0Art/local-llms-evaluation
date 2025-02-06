package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {};
        int[] expected = {};
        assertArrayEquals(expected, onlineStockSpan.calculateSpans(prices));
    }

}