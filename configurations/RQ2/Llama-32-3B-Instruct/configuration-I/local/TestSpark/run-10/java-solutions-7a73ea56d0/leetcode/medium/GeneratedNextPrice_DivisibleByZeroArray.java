package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNextPrice_DivisibleByZeroArray {

    @Test
    public void nextPrice_DivisibleByZeroArray() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int[] prices = {100};
        try {
            stockSpan.calculateSpans(prices);
            fail("Expected NumberFormatException");
        } catch (Exception e) {
        }
    }

}