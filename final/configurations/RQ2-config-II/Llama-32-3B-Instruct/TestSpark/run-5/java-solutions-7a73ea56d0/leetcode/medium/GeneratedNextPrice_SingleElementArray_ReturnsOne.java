package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNextPrice_SingleElementArray_ReturnsOne {

    @Test
    public void nextPrice_SingleElementArray_ReturnsOne() {
        List<Integer> prices = new ArrayList<>();
        prices.add(10);
        int result = OnlineStockSpan().next(5);
        assertEquals(1, result);
    }

}