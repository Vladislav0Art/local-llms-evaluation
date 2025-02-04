package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_SingleElement_ReturnsCorrectSpan {

    @Test
    public void calculateSpans_SingleElement_ReturnsCorrectSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{10});
        assertEquals(1, result[0]);
    }

}