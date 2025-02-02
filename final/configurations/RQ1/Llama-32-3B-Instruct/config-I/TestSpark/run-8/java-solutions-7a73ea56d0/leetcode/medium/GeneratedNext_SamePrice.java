package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;

public class GeneratedNext_SamePrice {

    @Test
    public void next_SamePrice() {
        OnlineStockSpan solution = new OnlineStockSpan();
        solution.next(3);
        solution.next(3);
        solution.next(4);
        assertEquals(2, solution.next(3));
    }

}