package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedNext_WhenPriceIs_Negative_ThenExpectedZeroReturns_1 {

    @Test
    public void next_WhenPriceIs_Negative_ThenExpectedZeroReturns_1() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = -1;
        int expectedValue = 1;
        int actualValue = instance.next(price);
        assertEquals(expectedValue, actualValue);
    }

}