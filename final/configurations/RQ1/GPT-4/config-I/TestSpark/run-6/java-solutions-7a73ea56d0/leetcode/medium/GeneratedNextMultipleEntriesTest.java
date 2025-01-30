package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleEntriesTest {

    @Test
    public void nextMultipleEntriesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(80);
        int result = onlineStockSpan.next(120);
        assertEquals(3, result);
    }

}