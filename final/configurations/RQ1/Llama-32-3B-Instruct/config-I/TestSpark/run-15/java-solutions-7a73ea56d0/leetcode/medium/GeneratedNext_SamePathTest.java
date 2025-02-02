package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.*;

public class GeneratedNext_SamePathTest {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_SamePathTest() {
        stockSpan.next(100);
        stockSpan.list.add(50);
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        assertEquals(4L, (long) stockSpan.next(5));
    }

}