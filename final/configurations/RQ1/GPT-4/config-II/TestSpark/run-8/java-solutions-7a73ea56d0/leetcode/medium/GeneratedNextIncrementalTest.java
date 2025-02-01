package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextIncrementalTest {

    @Test
    public void nextIncrementalTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(101);
        assertEquals(1, result);
    }

}