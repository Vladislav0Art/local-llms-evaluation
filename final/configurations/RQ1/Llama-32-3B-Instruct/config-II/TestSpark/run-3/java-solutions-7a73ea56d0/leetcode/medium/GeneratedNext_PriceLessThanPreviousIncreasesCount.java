package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_PriceLessThanPreviousIncreasesCount {

    private OnlineStockSpan solution = new OnlineStockSpan();

    @Test
    public void next_PriceLessThanPreviousIncreasesCount() {
        int[] result = Arrays.stream(new int[]{10, 8, 6}).mapToInt(o -> solution.next(o)).toArray();
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}