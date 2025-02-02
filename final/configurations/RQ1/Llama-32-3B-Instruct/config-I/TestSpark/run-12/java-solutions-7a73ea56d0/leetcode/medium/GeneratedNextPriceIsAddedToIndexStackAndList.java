package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceIsAddedToIndexStackAndList {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPriceIsAddedToIndexStackAndList() {
        stockSpan.next(10);
        assertNotNull(stockSpan.indexStack);
        assertEquals((long) 1, ((List<Integer>) stockSpan.indexStack).size());
    }

}