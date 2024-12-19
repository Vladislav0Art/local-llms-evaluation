package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_[GivenMultiplePrices]

_WhenCalculateCalled_ReturnsCorrectResult {

    @Mock
    private StockPrice stockPrice;

    @Test
    public void calculateSpans_[ GivenMultiplePrices]_WhenCalculateCalled_ReturnsCorrectResult() {
        int[] prices = {10, 20, 30};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(new int[]{1, 2, 3}, result);
    }

}