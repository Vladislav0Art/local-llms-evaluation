package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextSpan3Test {

    @Test
    public void nextSpan3Test() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(1);
        stockSpan.next(2);
        assertEquals(1, stockSpan.next(1));
    }

}