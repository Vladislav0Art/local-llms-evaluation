package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_SamePriceMultipleTimesTest {

    @Test
    public void next_SamePriceMultipleTimesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        solution.next(10);
        solution.next(10);
        assertEquals(4, solution.list.get(solution.list.size() - 1));
    }

}