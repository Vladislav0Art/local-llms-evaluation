package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNext_HappyPathTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_HappyPathTest() {
        assertEquals(1L, (long) stockSpan.next(100));
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(4L, (long) stockSpan.next(5));
    }

}