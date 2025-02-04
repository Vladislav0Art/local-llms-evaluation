package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PriceIsLessThanAllPreviousPrices_ReturnsCount {

    @Test
    public void next_PriceIsLessThanAllPreviousPrices_ReturnsCount() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expectedResult = {1, 2, 3};
        for (int i = 0; i < expectedResult.length; i++) {
            assertTrue(solution.next(i) == expectedResult[i]);
        }
    }

}