package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedTestNext {

    @Test
    public void testNext() {
        OnlineStockSpan span = new OnlineStockSpan();
        // Test 1:
        assertEquals(1, span.next(10));
        // Test 2:
        assertEquals(2, span.next(5));
        // Test 3:
        assertEquals(1, span.next(5));
    }

}