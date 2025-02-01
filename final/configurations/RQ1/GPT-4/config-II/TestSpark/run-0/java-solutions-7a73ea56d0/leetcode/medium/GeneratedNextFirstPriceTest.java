package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextFirstPriceTest {

    @Test
    public void nextFirstPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int result = onlineStockSpan.next(100);
        assertTrue("First price has span of 1", result == 1);
    }

}