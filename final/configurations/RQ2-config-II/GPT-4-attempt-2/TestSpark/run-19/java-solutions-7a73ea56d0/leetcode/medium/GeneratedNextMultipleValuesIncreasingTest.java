package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleValuesIncreasingTest {

    @Test
    public void nextMultipleValuesIncreasingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(120);
        assertEquals(2, result);
    }

}