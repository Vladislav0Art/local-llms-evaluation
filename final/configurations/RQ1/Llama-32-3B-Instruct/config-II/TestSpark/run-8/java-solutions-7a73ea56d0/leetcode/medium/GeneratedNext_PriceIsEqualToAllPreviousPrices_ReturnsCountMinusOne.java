package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PriceIsEqualToAllPreviousPrices_ReturnsCountMinusOne {

    @Test
    public void next_PriceIsEqualToAllPreviousPrices_ReturnsCountMinusOne() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] expectedResult = {1, 0, 0};
        for (int i = 0; i < expectedResult.length; i++) {
            assertTrue(solution.next(i) == expectedResult[i]);
        }
    }

}