package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_NoPricesReturnCorrectValue {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_NoPricesReturnCorrectValue() {
        int[] prices = {};
        int[] expected = {};
        assertArrayEquals(expected, stockSpan.calculateSpans(prices));
    }

}