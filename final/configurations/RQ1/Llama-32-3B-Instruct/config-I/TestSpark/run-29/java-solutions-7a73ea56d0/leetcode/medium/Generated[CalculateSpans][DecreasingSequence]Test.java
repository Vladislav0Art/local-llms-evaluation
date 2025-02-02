package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Generated[CalculateSpans][DecreasingSequence]

Test {

    private List<Integer> list = new ArrayList<>();
    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [CalculateSpans][DecreasingSequence]Test() {
        list.clear();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(15);
        assertEquals(new int[]{2, 1}, stockSpan.calculateSpans(new int[]{30, 20}));
    }

}