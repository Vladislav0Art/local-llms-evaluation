package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleValuesTest {

    @Test
    public void nextMultipleValuesTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(80);
        assertEquals(1, result);
    }

}