package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = OnlineStockSpan().calculateSpans(new int[0]);
        assertTrue(result.length == 0);
    }

}