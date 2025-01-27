package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DivisibleByPreviousDividend_ReturnsIncreaseInDaySpan {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_DivisibleByPreviousDividend_ReturnsIncreaseInDaySpan() {
        onlineStockSpan.next(100);
        assertEquals(2, onlineStockSpan.next(90));
    }

}