package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextEqualValueTest {

    @Test
    public void nextEqualValueTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        int next = onlineStockSpan.next(10);
        assertEquals(2, next);
    }

}