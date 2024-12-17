package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_[GivenPriceIsSingleElement]

_WhenCalculateCalled_ReturnsCorrectResult {

    @Mock
    private StockPrice stockPrice;

    @Test
    public void calculateSpans_[ GivenPriceIsSingleElement]_WhenCalculateCalled_ReturnsCorrectResult() {
        int[] prices = {10};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

}