package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_PriceDecreaseSpan_CorrectlyUpdate {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Test
    public void next_PriceDecreaseSpan_CorrectlyUpdate() {
        Stack<Integer> stack = new Stack<>();
        underTest.next(100, stack); // push 100 onto the stack
        underTest.next(90, stack); // push 90 onto the stack
        underTest.next(80, stack); // push 80 onto the stack
        int price = 70;
        int result = underTest.next(price, stack);
        assertEquals(3, result); // span is 1 (100-80)
    }

}