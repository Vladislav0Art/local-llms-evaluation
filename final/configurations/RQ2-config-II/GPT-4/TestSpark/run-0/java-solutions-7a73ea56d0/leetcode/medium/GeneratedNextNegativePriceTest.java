package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextNegativePriceTest {

    @Test
    public void nextNegativePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        try {
            stockSpan.next(-100);
        } catch (IllegalArgumentException e) {
            assertEquals("Price should not be negative.", e.getMessage());
        }
    }

}