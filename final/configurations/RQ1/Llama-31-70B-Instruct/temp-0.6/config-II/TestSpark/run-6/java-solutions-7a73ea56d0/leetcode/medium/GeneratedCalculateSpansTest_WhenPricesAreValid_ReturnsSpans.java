package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedCalculateSpansTest_WhenPricesAreValid_ReturnsSpans {

    @Test
    public void calculateSpansTest_WhenPricesAreValid_ReturnsSpans() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        int[] prices = {10, 5, 20, 25, 15, 10};
        int[] expectedSpans = {1, 1, 2, 1, 1, 1};

        int[] actualSpans = stockSpan.calculateSpans(prices);
        Assert.assertArrayEquals(expectedSpans, actualSpans);
    }

}