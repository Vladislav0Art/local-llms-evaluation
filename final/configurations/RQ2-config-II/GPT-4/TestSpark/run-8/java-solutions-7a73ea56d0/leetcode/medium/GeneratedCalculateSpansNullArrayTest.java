package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedCalculateSpansNullArrayTest {

    @Test
    public void calculateSpansNullArrayTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            stockSpan.calculateSpans(null);
        } catch (NullPointerException e) {
            assertEquals("Prices array cannot be null", e.getMessage());
        }
    }

}