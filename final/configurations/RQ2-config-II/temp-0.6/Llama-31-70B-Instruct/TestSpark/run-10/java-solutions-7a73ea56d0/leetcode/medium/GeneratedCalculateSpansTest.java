package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpansTest {

    // Test for next(int price) method

    @Test
    public void calculateSpansTest() {
        // Create an instance of OnlineStockSpan
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // Call the calculateSpans method and verify the output
        assertArrayEquals(new int[]{1, 1, 3, 2, 1}, stockSpan.calculateSpans(new int[]{100, 80, 60, 70, 60}));
        assertArrayEquals(new int[]{1, 1, 1, 1, 1}, stockSpan.calculateSpans(new int[]{1, 1, 1, 1, 1}));
        assertArrayEquals(new int[]{1, 2, 1, 4, 1}, stockSpan.calculateSpans(new int[]{1, 2, 1, 4, 1}));
    }

}