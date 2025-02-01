package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextEmptyListTest {

    @Test
    public void nextEmptyListTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertEquals("Span for first element should be 1", 1, result);
    }

}