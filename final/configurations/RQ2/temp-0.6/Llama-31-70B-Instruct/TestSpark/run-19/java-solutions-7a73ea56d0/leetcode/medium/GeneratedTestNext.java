package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GeneratedTestNext {

    @Test
    public void testNext() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(1));
        assertEquals(1, stockSpan.next(2));
        assertEquals(2, stockSpan.next(3));
        assertEquals(3, stockSpan.next(4));
    }

}