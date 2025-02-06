package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_SamePriceTwice_ReturnTwo {

    @Test
    public void next_SamePriceTwice_ReturnTwo() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] previousPrices = {10};
        int[] currentPrices = {10};
        Stack<Integer> stack = new Stack<>();
        stack.push(0);
        for (int i = 1; i <= 2; i++) {
            solution.next(currentPrices[i - 1]);
            int nextPrice = solution.next(currentPrices[i - 1]);
            if (currentPrices[i - 1] == previousPrices[i - 1]) {
                assert stack.peek() == nextPrice;
            } else {
                while (!stack.isEmpty()) {
                    stack.pop();
                }
                stack.push(nextPrice);
            }
            previousPrices[i] = currentPrices[i];
        }
        assertEquals(2, solution.next(currentPrices[2]));
    }

}