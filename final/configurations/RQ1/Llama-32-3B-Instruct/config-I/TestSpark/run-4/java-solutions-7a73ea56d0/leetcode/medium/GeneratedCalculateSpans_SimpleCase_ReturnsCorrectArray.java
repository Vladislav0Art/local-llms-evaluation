package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedCalculateSpans_SimpleCase_ReturnsCorrectArray {

    @Test
    public void calculateSpans_SimpleCase_ReturnsCorrectArray() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{10, 7, 5});
        assertArrayEquals(new int[]{2, 1, 1}, result);
    }

}