package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceIsOne {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceIsOne() {
        stockSpan.next(100);
        assertEquals(1L, (long) stockSpan.list.get(0));
    }

}