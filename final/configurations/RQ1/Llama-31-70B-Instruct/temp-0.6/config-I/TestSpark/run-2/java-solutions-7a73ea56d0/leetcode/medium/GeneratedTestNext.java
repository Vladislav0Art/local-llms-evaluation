package leetcode.medium;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedTestNext {

    @Test
    public void testNext() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(10));
        assertEquals(1, stockSpan.next(20));
        assertEquals(2, stockSpan.next(5));
        assertEquals(1, stockSpan.next(15));
        assertEquals(2, stockSpan.next(25));
        assertEquals(3, stockSpan.next(20));
        assertEquals(1, stockSpan.next(30));
    }

}