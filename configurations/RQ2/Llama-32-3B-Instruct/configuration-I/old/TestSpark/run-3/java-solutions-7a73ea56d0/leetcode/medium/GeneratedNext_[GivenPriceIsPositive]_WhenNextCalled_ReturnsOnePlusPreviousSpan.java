package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_[GivenPriceIsPositive]

_WhenNextCalled_ReturnsOnePlusPreviousSpan {

    @Mock
    private StockPrice stockPrice;

    @Test
    public void next_[ GivenPriceIsPositive]_WhenNextCalled_ReturnsOnePlusPreviousSpan() {
        int previousPrice = 10;
        Mockito.when(stockPrice.getPrice()).thenReturn(previousPrice + 5);
        OnlineStockSpan instance = new OnlineStockSpan();
        int result = instance.next(0);
        Mockito.verify(stockPrice).update(Mockito.anyInt());
        assertEquals(previousPrice + 6, result);
    }

}