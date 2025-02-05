package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleValuesAscendingTest {

    @Test
    public void nextMultipleValuesAscendingTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(90);
        int result = onlineStockSpan.next(110);
        assertEquals(3, result);
    }

}