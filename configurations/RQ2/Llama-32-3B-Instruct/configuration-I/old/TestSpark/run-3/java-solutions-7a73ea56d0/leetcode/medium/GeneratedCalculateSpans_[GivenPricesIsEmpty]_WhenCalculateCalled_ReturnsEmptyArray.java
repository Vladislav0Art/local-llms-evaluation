package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_[GivenPricesIsEmpty]

_WhenCalculateCalled_ReturnsEmptyArray {

    @Mock
    private StockPrice stockPrice;

    @Test
    public void calculateSpans_[ GivenPricesIsEmpty]_WhenCalculateCalled_ReturnsEmptyArray() {
        int[] prices = {};
        int[] result = OnlineStockSpan.calculateSpans(prices);
        assertArrayEquals(result, new int[]{});
    }

}