package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan obj = new OnlineStockSpan();
        assertEquals(1, obj.next(1));
        assertEquals(2, obj.next(2));
        assertEquals(1, obj.next(1));
    }

}