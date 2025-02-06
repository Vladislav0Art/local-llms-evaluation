package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedCalculateSpans_MocksCalculateSpans_ReturnsCorrectResult {

    @Test
    public void calculateSpans_MocksCalculateSpans_ReturnsCorrectResult() {
        OnlineStockSpan solution = mock(OnlineStockSpan.class);
        when(solution.calculateSpans(anyInt[]())).thenReturn(ints(1, 2, 1, 2, 3, 2));
        int[] result = solution.calculateSpans(new int[]{10, 7, 5, 8, 11, 9});
        assertThat(Arrays.asList(result), is(Arrays.asList(1, 2, 1, 2, 3, 2)));
    }

}