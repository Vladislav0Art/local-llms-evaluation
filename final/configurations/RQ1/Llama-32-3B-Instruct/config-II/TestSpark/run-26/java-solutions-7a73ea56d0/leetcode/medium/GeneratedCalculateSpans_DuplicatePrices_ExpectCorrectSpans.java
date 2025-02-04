package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedCalculateSpans_DuplicatePrices_ExpectCorrectSpans {

    @Test
    public void calculateSpans_DuplicatePrices_ExpectCorrectSpans() {
        int[] prices = {10, 10, 20};
        int[] spans = OnlineStockSpan.calculateSpans(prices);
        for (int i = 1; i < spans.length; i++) {
            if (spans[i] > spans[i - 1]) {
                fail("Incorrect span at index " + i);
            }
        }
    }

}