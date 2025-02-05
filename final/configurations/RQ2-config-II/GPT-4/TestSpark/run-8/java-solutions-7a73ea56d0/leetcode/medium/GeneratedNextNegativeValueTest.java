package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import leetcode.medium.OnlineStockSpan;

public class GeneratedNextNegativeValueTest {

    @Test
    public void nextNegativeValueTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            stockSpan.next(-1);
        } catch (IllegalArgumentException e) {
            assertEquals("Price can not be negative", e.getMessage());
        }
    }

}