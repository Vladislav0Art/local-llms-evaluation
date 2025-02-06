package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNextPrice_EmptyArray_ReturnsZero {

    @Test
    public void nextPrice_EmptyArray_ReturnsZero() {
        List<Integer> prices = new ArrayList<>();
        int result = OnlineStockSpan().next(0);
        assertEquals(0, result);
    }

}