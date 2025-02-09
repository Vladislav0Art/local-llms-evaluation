package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedNext_ConsecutiveNumbers {

    @Test
    public void next_ConsecutiveNumbers() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30};
        for (int price : prices) {
            solution.next(price);
        }
        assertEquals(1, solution.next(100));
    }

}