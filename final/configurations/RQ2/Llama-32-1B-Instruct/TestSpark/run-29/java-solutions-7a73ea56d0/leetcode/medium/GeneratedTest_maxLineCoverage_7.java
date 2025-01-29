package leetcode.medium;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class GeneratedTest_maxLineCoverage_7 {

    public static void main(String[] args) {
    }

    @Test
    public void test_maxLineCoverage_7() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        int[] prices = {5, 4};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result.length);
    }

}