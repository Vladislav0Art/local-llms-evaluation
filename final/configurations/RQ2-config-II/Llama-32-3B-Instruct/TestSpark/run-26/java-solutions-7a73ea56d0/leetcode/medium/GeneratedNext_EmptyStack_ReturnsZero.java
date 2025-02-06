package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_EmptyStack_ReturnsZero {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void next_EmptyStack_ReturnsZero() {
        Stack<Integer> stack = new Stack<>();
        int price = 100;
        int result = underTest.next(price, stack);
        assertEquals(0, result);
    }

}