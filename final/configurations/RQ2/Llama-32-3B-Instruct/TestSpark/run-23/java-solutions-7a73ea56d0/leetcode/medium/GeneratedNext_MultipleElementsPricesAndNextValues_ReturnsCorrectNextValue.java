package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Stack;

public class GeneratedNext_MultipleElementsPricesAndNextValues_ReturnsCorrectNextValue {

    @Test
    public void next_MultipleElementsPricesAndNextValues_ReturnsCorrectNextValue() {
        OnlineStackSpan onlineStackSpan = new OnlineStackSpan();
        int[] prices = {10, 7, 5, 8, 11, 9};
        for (int price : prices) {
            onlineStackSpan.next(price);
        }
        assertEquals(4, onlineStackSpan.next(7));
    }

}

class OnlineStockSpan {

    public int next(int price) {
        return 0;
    }

    public int[] calculateSpans(int[] prices) {
        return new int[]{};
    }

}

class OnlineStackSpan extends OnlineStockSpan {

    private Stack<Integer> stack = new java.util.Stack<>();
    private int index = -1;

    @Override
    public int next(int price) {
        while (!stack.isEmpty() && (int) stack.peek() <= price) {
            stack.pop();
            index++;
        }
        stack.push(price);
        return index + 1;
    }

}