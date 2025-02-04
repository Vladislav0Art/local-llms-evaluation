package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPriceIsLowerThanLastElement_ReturnsCorrectSpan {

    @Test
    public void NextPriceIsLowerThanLastElement_ReturnsCorrectSpan() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        List<Integer> list = new ArrayList<>();
        onlineStockSpan.list = list;

        int result = onlineStockSpan.next(10);
        assertEquals(1, result);

        int nextResult = onlineStockSpan.next(20);
        assertEquals(3, nextResult);
    }

}