package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_SpanOfAllElementsIsDifferentTest {

    @Test
    public void calculateSpans_SpanOfAllElementsIsDifferentTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 20, 30, 40, 50};
        for (int i : solution.calculateSpans(prices))
            assertTrue(i != solution.list.size());
    }

}