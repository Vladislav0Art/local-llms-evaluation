package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextGreaterPriceTest {

    @Test
    public void nextGreaterPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        int result = onlineStockSpan.next(150);
        assertTrue("Greater price has span of 1", result == 1);
    }

}