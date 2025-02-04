package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_ReturnsCorrectValue {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_ReturnsCorrectValue() {
        int price = 10;
        int expected = 1;
        assertEquals(expected, stockSpan.next(price));
    }

}