package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextLowerPriceTest {

    @Test
    public void nextLowerPriceTest() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(150);
        int result = onlineStockSpan.next(50);
        assertTrue("Lower price has span of 3", result == 3);
    }

}