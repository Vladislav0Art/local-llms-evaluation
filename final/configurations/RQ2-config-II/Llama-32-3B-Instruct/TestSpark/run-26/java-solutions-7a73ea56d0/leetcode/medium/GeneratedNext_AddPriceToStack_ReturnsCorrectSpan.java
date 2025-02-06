package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_AddPriceToStack_ReturnsCorrectSpan {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void next_AddPriceToStack_ReturnsCorrectSpan() {
        Stack<Integer> stack = new Stack<>();
        underTest.next(10, stack); // push 10 onto the stack
        underTest.next(20, stack); // push 20 onto the stack
        int price = 30;
        int result = underTest.next(price, stack);
        assertEquals(1, result); // span is 2 (20-10)
    }

}