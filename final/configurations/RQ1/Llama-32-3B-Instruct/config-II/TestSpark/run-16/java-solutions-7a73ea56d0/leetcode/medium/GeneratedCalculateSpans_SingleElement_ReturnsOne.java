package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_SingleElement_ReturnsOne {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElement_ReturnsOne() {
        int[] result = stockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(result, new int[]{1});
    }

}