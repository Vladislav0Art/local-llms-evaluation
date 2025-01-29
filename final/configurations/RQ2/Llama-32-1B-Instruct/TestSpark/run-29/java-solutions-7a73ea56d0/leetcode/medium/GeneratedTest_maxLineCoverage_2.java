package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest_maxLineCoverage_2 {

    public static void main(String[] args) {
    }

    @Test
    public void test_maxLineCoverage_2() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 1, 3};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(0, result.length);
    }

}