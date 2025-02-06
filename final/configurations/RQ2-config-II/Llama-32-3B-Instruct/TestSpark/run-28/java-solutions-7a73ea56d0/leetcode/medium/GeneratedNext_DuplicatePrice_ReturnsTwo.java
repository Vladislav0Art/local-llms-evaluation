package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_DuplicatePrice_ReturnsTwo {

    @Test
    public void next_DuplicatePrice_ReturnsTwo() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(100);
        int result2 = solution.next(100);
        assertEquals(2, result2);
    }

}