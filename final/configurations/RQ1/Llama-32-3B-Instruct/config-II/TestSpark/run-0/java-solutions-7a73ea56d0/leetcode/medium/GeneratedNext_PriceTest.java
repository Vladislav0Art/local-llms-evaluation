package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_PriceTest {

    @Test
    public void next_PriceTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(10);
        assertEquals(1, solution.list.get(solution.list.size() - 1));
        solution.next(7);
        assertEquals(2, solution.list.get(solution.list.size() - 1));
        solution.next(5);
        assertEquals(3, solution.list.get(solution.list.size() - 1));
    }

}