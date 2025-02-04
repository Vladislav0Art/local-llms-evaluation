package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_MultiplePrices_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_MultiplePrices_ReturnsCorrectSpans() {
        stockSpan.next(100);
        stockSpan.next(80);
        stockSpan.next(70);
        assertEquals(2, stockSpan.list.size());
    }

}