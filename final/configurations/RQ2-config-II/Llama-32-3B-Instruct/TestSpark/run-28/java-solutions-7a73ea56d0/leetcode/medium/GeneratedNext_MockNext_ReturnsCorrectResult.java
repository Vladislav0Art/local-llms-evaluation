package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_MockNext_ReturnsCorrectResult {

    @Test
    public void next_MockNext_ReturnsCorrectResult() {
        OnlineStockSpan solution = new OnlineStockSpan();
        final int[] price = {100};
        MockitoAnnotations.initMocks(this);
        when(solution.next(Mockito.anyInt())).thenReturn(price[0]);
        int result = solution.next(100);
        assertEquals(1, result);
    }

}