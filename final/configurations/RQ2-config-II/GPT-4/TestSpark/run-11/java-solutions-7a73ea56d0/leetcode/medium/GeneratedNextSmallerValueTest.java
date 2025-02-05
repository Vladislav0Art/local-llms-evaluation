package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextSmallerValueTest {

    @Test
    public void nextSmallerValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int next = onlineStockSpan.next(10);
        assertEquals(1, next);
    }

}