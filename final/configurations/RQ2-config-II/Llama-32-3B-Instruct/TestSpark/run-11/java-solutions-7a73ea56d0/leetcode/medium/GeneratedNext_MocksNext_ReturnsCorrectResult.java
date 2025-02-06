package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

import java.util.Arrays;

public class GeneratedNext_MocksNext_ReturnsCorrectResult {

    @Test
    public void next_MocksNext_ReturnsCorrectResult() {
        OnlineStockSpan solution = mock(OnlineStockSpan.class);
        when(solution.next(anyInt())).thenReturn(1);
        int result = solution.next(10);
        assertThat(result, is(1));
    }

}