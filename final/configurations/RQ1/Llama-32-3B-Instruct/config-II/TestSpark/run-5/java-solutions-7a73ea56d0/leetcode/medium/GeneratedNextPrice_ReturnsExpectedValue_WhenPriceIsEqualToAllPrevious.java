package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_ReturnsExpectedValue_WhenPriceIsEqualToAllPrevious {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_ReturnsExpectedValue_WhenPriceIsEqualToAllPrevious() {
        assertEquals(2, onlineStockSpan.next(100));
        onlineStockSpan.next(100);
    }

}