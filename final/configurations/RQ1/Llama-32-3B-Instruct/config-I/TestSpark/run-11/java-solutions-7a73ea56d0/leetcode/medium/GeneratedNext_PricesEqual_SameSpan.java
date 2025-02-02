package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_PricesEqual_SameSpan {

    @Test
    public void next_PricesEqual_SameSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(100);
        assertTrue(solution.list.get(solution.list.size() - 1) == 2L);
    }

}