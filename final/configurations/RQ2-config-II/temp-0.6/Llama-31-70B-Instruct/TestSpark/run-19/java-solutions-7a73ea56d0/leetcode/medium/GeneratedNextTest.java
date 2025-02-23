package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        assertEquals(1, obj.next(10));
        assertEquals(1, obj.next(11));
        assertEquals(2, obj.next(9));
    }

}