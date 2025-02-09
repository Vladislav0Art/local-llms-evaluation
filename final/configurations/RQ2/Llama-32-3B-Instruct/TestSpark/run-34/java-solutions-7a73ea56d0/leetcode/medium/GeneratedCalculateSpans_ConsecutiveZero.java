package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedCalculateSpans_ConsecutiveZero {

    @Test
    public void calculateSpans_ConsecutiveZero() {
        OnlineStockSpan solution = new OnlineStockSpan();
        for (int i = 0; i < 10; i++) {
            int price = -i;
            solution.next(price);
        }
        int[] result = solution.calculateSpans(new int[]{1});
        assertEquals(1, result[0]);
    }

}