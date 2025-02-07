package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class GeneratedNext_NegativePrice_WillReturnNegativeIndex_0 {

    private OnlineStockSpan instance = new OnlineStockSpan();

    @Test
    public void next_NegativePrice_WillReturnNegativeIndex_0() {
        int[] prices = {-10, 5, 20};
        int result = instance.next(-10);
        assertEquals(-2, result); // max coverage of line: price - first price + current index
    }

}