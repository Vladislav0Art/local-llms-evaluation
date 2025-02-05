package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultipleInvocationsTest {

    // Test next method

    @Test
    public void nextMultipleInvocationsTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(100);
        int result = stockSpan.next(180);
        assertEquals(2, result);
    }

}