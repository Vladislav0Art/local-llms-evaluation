package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNextPrice_MultipleIterationsReturnSameValue {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void nextPrice_MultipleIterationsReturnSameValue() {
        int price = 10;
        int price2 = 20;
        int expected = 1;
        assertEquals(expected, stockSpan.next(price));
        assertEquals(expected, stockSpan.next(price2));
    }

}