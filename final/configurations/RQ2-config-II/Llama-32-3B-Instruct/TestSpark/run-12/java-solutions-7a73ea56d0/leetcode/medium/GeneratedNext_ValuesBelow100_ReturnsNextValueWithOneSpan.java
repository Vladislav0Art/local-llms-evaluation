package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GeneratedNext_ValuesBelow100_ReturnsNextValueWithOneSpan {

    @Test
    public void next_ValuesBelow100_ReturnsNextValueWithOneSpan() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int result = solution.next(60);
        assertTrue(result == 61 || result == 62);
    }

}