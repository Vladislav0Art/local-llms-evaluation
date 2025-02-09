package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedCalculateSpans_ZeroConsecutive {

    @Test
    public void calculateSpans_ZeroConsecutive() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10000; i++) {
            int price = -i;
            solution.next(price);
        }
        int[] result = solution.calculateSpans(new int[]{10});
        assertEquals(1, result[0]);
    }

}