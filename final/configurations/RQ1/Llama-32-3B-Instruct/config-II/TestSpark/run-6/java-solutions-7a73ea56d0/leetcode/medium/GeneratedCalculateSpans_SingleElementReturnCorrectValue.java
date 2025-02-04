package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SingleElementReturnCorrectValue {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementReturnCorrectValue() {
        int[] prices = {10};
        int[] expected = {1};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}