package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_WhenPriceIncreases_SpanIncreases {

    @Test
    public void next_WhenPriceIncreases_SpanIncreases() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(80);
        assertTrue(solution.list.get(solution.list.size() - 1) >= 2L);
    }

}