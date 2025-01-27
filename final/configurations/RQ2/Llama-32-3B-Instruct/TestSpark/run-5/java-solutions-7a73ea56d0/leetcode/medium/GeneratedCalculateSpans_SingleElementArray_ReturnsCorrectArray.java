package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsCorrectArray {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementArray_ReturnsCorrectArray() {
        int result[] = onlineStockSpan.calculateSpans(new int[]{10});
        assertEquals(new int[]{10}, result);
    }

}