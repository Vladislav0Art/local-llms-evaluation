package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedTestNext {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void testNext() throws Exception {
        assertEquals((long) 1, stockSpan.next(100));
        assertNotEquals((long) 2, stockSpan.next(50));

        stockSpan.next(50);
        stockSpan.next(40);

        assertEquals((long) 3, stockSpan.next(10));

        assertEquals((long) 4, stockSpan.next(5));
    }

}