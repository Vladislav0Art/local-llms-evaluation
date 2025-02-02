package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_EmptyArray_ReturnsEmptyArray {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_EmptyArray_ReturnsEmptyArray() {
        int[] result = onlineStockSpan.calculateSpans(new int[0]);
        assert result == null;
    }

}