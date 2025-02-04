package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SpanOfAllElementsIsSameTest {

    @Test
    public void calculateSpans_SpanOfAllElementsIsSameTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {100, 80, 75, 60, 55, 40};
        for (int i : solution.calculateSpans(prices))
            assertTrue(i == solution.list.size());
    }

}