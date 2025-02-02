package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_IncreasingSequence_ReturnsCorrectCount {

    @Test
    public void next_IncreasingSequence_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(1);
        onlineStockSpan.next(3);
        onlineStockSpan.next(5);
        int result = onlineStockSpan.next(2);
        assertEquals(1, result);
    }

}