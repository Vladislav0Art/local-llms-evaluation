package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Generated[calculateSpans][DecreasingSequence]

Test {

    @Test
    public void [calculateSpans][DecreasingSequence]Test() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            solution.next(i * -2);
        }
        int[] result = solution.calculateSpans(new int[]{35, 20, 15, 10});
        assertArrayEquals(new int[]{1, 3, 5, 7}, result);
    }

}