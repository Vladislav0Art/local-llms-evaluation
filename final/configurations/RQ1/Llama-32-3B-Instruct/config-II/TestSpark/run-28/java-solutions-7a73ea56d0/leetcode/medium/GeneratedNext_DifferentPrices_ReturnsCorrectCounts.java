package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_DifferentPrices_ReturnsCorrectCounts {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_DifferentPrices_ReturnsCorrectCounts() {
        onlineStockSpan.next(50);
        onlineStockSpan.next(60);
        onlineStockSpan.next(70);
        assertEquals(2, onlineStockSpan.next(60));
        assertEquals(1, onlineStockSpan.next(70));
    }

}