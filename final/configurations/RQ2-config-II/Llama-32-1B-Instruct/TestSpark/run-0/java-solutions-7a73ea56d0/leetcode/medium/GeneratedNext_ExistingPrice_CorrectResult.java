package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_ExistingPrice_CorrectResult {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void next_ExistingPrice_CorrectResult() {
        int[] prices = {70, 75, 80};
        int result = instance.next(70);
        assertEquals(1, result); // max coverage of line: price - first price
    }

}