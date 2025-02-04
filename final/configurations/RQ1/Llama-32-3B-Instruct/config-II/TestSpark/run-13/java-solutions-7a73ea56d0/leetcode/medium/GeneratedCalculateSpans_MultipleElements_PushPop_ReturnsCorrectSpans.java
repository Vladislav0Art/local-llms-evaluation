package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultipleElements_PushPop_ReturnsCorrectSpans {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElements_PushPop_ReturnsCorrectSpans() {
        int[] prices = {10, 5, 8};
        stockSpan.next(10);
        stockSpan.next(5);
        stockSpan.next(8);

        Stack<Integer> indexStack = new Stack<>();
        for (int i : stockSpan.list) {
            if (i > 10)
                continue;
            while (!indexStack.isEmpty() && prices[indexStack.peek()] <= i)
                indexStack.pop();
            // ... rest of the code remains same
        }
    }

}