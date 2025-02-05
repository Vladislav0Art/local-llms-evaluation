package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextGreaterValueTest {

    @Test
    public void nextGreaterValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        int next = onlineStockSpan.next(20);
        assertEquals(2, next);
    }

}