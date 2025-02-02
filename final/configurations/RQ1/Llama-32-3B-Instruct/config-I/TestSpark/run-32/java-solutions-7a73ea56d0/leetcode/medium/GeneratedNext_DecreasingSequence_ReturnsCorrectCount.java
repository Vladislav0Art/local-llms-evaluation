package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DecreasingSequence_ReturnsCorrectCount {

    @Test
    public void next_DecreasingSequence_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(5);
        onlineStockSpan.next(4);
        onlineStockSpan.next(3);
        int result = onlineStockSpan.next(6);
        assertEquals(1, result);
    }

}