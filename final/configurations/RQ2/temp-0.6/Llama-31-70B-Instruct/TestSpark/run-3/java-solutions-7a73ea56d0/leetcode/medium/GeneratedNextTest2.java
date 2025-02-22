package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextTest2 {

    @Test
    public void nextTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        int result = stockSpan.next(5);
        assertEquals(1, result);
    }

}