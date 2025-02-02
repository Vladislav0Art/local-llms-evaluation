package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.ArrayList;

public class GeneratedCalculateSpans_MultipleMixing_ReturnsCorrectArray {

    @Test
    public void calculateSpans_MultipleMixing_ReturnsCorrectArray() {
        OnlineStockSpan s = new OnlineStockSpan();
        int[] result = s.calculateSpans(new int[]{10, 8, 6, 7, 5});
        assertArrayEquals(new int[]{1, 2, 2, 3, 4}, result);
    }

}