package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_[GivenPriceIsZero]

_WhenNextCalled_ReturnsOne {

    @Mock
    private StockPrice stockPrice;

    @Test
    public void next_[ GivenPriceIsZero]_WhenNextCalled_ReturnsOne() {
        int result = OnlineStockSpan.next(0);
        Mockito.verify(stockPrice).update(Mockito.anyInt());
        assertEquals(1, result);
    }

}