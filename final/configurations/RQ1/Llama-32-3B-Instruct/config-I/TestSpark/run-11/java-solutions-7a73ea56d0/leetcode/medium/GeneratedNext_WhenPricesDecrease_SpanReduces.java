package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_WhenPricesDecrease_SpanReduces {

    @Test
    public void next_WhenPricesDecrease_SpanReduces() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(100);
        solution.next(80);
        solution.next(70);
        assertTrue(solution.list.get(solution.list.size() - 1) >= 3L);
    }

}