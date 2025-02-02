package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_SingleElementArray_ReturnsSpanOf1 {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_SingleElementArray_ReturnsSpanOf1() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertThat(result, Arrays.asList(1));
    }

}