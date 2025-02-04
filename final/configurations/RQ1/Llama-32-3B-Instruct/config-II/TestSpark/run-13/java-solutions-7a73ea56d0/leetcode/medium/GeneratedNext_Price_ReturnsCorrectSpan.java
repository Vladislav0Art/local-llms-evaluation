package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_Price_ReturnsCorrectSpan {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_Price_ReturnsCorrectSpan() {
        stockSpan.next(100);
        assertEquals(1, stockSpan.list.get(0));
        assertEquals(0, stockSpan.list.get(1));
    }

}