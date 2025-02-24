package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextSpan2Test {

    @Test
    public void nextSpan2Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1);
        assertEquals(2, stockSpan.next(2));
    }

}