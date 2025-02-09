package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedCalculateSpansEmptyArrayTest {

    @Test
    public void calculateSpansEmptyArrayTest() {
        OnlineStockSpan solution = new OnlineStockSpan();
        int[] result = solution.calculateSpans(new int[0]);
        assert result.length == 0;
    }

}