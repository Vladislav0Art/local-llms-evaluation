package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Generated[CalculateSpans][MultipleElements]

Test {

    private List<Integer> list = new ArrayList<>();
    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [CalculateSpans][MultipleElements]Test() {
        int[] prices = {10, 20, 15, 30};
        int[] result = stockSpan.calculateSpans(prices);
        assertTrue(Arrays.equals(result, new int[]{2, 3, 4, 5}));
    }

}