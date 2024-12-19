package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_ReturnsCountWhenPriceIsGreaterOrEqual {

    @Test
    public void nextPrice_ReturnsCountWhenPriceIsGreaterOrEqual() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(100);
        onlineStockSpan.next(50);
        onlineStockSpan.next(70);
        assertEquals(2, onlineStockSpan.list.size());
    }

}