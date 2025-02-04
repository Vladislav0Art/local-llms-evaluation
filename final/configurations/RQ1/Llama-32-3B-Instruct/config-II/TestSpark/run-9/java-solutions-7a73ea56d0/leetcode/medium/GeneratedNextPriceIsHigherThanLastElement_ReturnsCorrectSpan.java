package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceIsHigherThanLastElement_ReturnsCorrectSpan {

    @Test
    public void nextPriceIsHigherThanLastElement_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        int result = onlineStockSpan.next(10);
        assertEquals(1, result);

        int nextResult = onlineStockSpan.next(20);
        assertEquals(2, nextResult);
    }

}