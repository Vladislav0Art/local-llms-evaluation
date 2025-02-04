package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_LargeArray_ExpectCorrectSpans {

    @Test
    public void calculateSpans_LargeArray_ExpectCorrectSpans() {
        int[] prices = new int[10000];
        for (int i = 0; i < 10000; i++) {
            prices[i] = 10;
        }
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        for (int i = 1; i < spans.length; i++) {
            if (spans[i] > spans[i - 1]) {
                fail("Incorrect span at index " + i);
            }
        }
    }

}