package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnCorrectSpans {

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnCorrectSpans() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[]{100, 80, 75, 70});
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
    }

}