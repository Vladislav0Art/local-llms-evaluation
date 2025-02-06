package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_SinglePrice_ReturnsOne {

    @Test
    public void next_SinglePrice_ReturnsOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(100);
        assertEquals(1, result);
    }

}