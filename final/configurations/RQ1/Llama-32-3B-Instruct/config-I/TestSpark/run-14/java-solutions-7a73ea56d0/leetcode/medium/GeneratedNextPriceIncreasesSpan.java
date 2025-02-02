package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceIncreasesSpan {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceIncreasesSpan() {
        stockSpan.next(150);
        assertEquals(2L, (long) stockSpan.list.size());
        assertTrue((int) stockSpan.list.get(0) > 100);
        assertEquals(-1L, (long) stockSpan.next(50));
    }

}