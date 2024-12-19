package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_GivenNullPrice_ThrowsNullPointerException {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_GivenNullPrice_ThrowsNullPointerException() {
        try {
            onlineStockSpan.next(null);
            fail("Expected NullPointerException to be thrown");
        } catch (NullPointerException e) {
            // Expected
        }
    }

}