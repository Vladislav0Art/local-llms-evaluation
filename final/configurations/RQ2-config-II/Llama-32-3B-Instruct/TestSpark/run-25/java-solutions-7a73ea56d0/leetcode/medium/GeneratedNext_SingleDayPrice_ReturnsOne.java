package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedNext_SingleDayPrice_ReturnsOne {

    @Test
    public void next_SingleDayPrice_ReturnsOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(100);
        assertEquals(1, result);
    }

}