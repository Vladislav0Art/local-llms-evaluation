package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedCalculateSpans_DivisibleByZeroArray {

    @Test
    public void calculateSpans_DivisibleByZeroArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        try {
            stockSpan.calculateSpans(prices);
            fail("Expected NumberFormatException");
        } catch (Exception e) {
        }
    }

}