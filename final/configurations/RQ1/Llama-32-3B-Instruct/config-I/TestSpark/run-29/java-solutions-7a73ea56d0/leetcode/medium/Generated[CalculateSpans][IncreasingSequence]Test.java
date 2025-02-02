package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Generated[CalculateSpans][IncreasingSequence]

Test {

    private List<Integer> list = new ArrayList<>();
    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void [CalculateSpans][IncreasingSequence]Test() {
        list.clear();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        stockSpan.next(40);
        assertEquals(new int[]{2, 3, 4, 5}, stockSpan.calculateSpans(new int[]{10, 20, 30, 40}));
    }

}