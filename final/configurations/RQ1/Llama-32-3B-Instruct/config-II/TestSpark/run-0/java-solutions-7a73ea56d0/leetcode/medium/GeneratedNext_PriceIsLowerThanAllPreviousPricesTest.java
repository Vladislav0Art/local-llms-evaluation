package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedNext_PriceIsLowerThanAllPreviousPricesTest {

    @Test
    public void next_PriceIsLowerThanAllPreviousPricesTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] prices = {10, 5};
        solution.next(3);
        assertEquals(2, solution.list.get(solution.list.size() - 1));
    }

}