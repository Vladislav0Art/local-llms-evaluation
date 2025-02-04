package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyArray_ExpectZeroes {

    @Test
    public void calculateSpans_EmptyArray_ExpectZeroes() {
        int[] prices = {};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        for (int span : spans) {
            assertTrue(span == 0 || span == 1);
        }
    }

}