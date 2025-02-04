package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_MultipleElements_ReturnsCorrectSpans {

    @Test
    public void calculateSpans_MultipleElements_ReturnsCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{100, 80, 75, 70});
        assertArrayEquals(result, new int[]{1, 2, 3, 4});
    }

}