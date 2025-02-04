package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_ReturnsExpectedValue_WhenPriceIsLowerThanAllPrevious {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_ReturnsExpectedValue_WhenPriceIsLowerThanAllPrevious() {
        assertEquals(1, onlineStockSpan.next(100));
    }

}