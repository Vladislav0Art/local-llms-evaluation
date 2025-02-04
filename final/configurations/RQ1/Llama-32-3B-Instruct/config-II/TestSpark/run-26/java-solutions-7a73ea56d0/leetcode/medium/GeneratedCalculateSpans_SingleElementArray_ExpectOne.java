package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ExpectOne {

    @Test
    public void calculateSpans_SingleElementArray_ExpectOne() {
        int[] prices = {10};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        assertEquals(1, spans[0]);
    }

}