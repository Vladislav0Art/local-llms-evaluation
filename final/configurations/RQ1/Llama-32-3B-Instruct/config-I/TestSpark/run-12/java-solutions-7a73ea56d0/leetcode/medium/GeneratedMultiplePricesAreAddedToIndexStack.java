package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedMultiplePricesAreAddedToIndexStack {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void multiplePricesAreAddedToIndexStack() {
        stockSpan.next(5);
        stockSpan.next(3);
        stockSpan.next(7);
        assertNotNull(stockSpan.indexStack);
        assertEquals((long) 1, ((List<Integer>) stockSpan.indexStack).size());
    }

}