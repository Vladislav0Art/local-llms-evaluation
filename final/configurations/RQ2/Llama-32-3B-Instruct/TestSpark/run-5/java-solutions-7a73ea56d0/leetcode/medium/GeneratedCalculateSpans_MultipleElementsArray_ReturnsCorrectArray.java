package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

import org.mockito.Mockito;

public class GeneratedCalculateSpans_MultipleElementsArray_ReturnsCorrectArray {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_MultipleElementsArray_ReturnsCorrectArray() {
        int result[] = onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 8, 6});
        assert Arrays.equals(result, new int[]{10, 11, 12, 3, 4});
    }

}