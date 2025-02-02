package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DuplicateElements_ReturnsCorrectCount {

    @Test
    public void next_DuplicateElements_ReturnsCorrectCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(30);
        onlineStockSpan.next(30);
        int result = onlineStockSpan.next(30);
        assertEquals(2, result);
    }

}