package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.Random;

public class GeneratedCalculateSpans_EmptyArray {

    @Test
    public void calculateSpans_EmptyArray() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assertTrue(result.length == 0);
    }

}