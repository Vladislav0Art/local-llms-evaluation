package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_EmptyList_Returns0 {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_EmptyList_Returns0() {
        int price = 100;
        int expected = 0;
        assertEquals(expected, stockSpan.next(price));
    }

}