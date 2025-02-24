package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextTest {

    // Test for next(int price) method

    @Test
    public void nextTest() {
        // Create an instance of OnlineStockSpan
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        // Call the next method and verify the output
        assertEquals(0, stockSpan.next(10));
        assertEquals(1, stockSpan.next(5));
        assertEquals(1, stockSpan.next(5));
        assertEquals(4, stockSpan.next(7));
        assertEquals(6, stockSpan.next(9));
        assertEquals(1, stockSpan.next(1));
    }

}