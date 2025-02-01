package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextDecrementalTest {

    @Test
    public void nextDecrementalTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(101);
        int result = stockSpan.next(100);
        assertEquals(2, result);
    }

}