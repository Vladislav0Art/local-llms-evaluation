package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceIsSameAsPrevious {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceIsSameAsPrevious() {
        stockSpan.next(100);
        stockSpan.next(100);
        assertEquals(2L, (long) stockSpan.list.size());
        assertTrue((int) stockSpan.list.get(0) > 99 && (int) stockSpan.list.get(1) > 100);
        assertEquals(-1L, (long) stockSpan.next(100));
    }

}