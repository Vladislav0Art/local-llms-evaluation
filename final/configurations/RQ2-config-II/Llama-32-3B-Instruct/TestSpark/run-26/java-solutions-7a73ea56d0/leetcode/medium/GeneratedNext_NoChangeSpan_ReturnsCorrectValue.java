package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_NoChangeSpan_ReturnsCorrectValue {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void next_NoChangeSpan_ReturnsCorrectValue() {
        Stack<Integer> stack = new Stack<>();
        underTest.next(10, stack); // push 10 onto the stack
        int price = 20;
        int result = underTest.next(price, stack);
        assertEquals(1, result); // span is still 1 (20-10)
    }

}