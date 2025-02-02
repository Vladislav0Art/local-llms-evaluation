package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Generated[CalculateSpans][SingleElement]

Test {

    private List<Integer> list = new ArrayList<>();
    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [CalculateSpans][SingleElement]Test() {
        int[] prices = {100};
        int[] result = stockSpan.calculateSpans(prices);
        assertTrue(Arrays.equals(result, new int[]{1}));
    }

}