package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleEntriesLowerTest {

    @Test
    public void nextMultipleEntriesLowerTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(110);
        int result = onlineStockSpan.next(90);
        assertEquals(1, result);
    }

}