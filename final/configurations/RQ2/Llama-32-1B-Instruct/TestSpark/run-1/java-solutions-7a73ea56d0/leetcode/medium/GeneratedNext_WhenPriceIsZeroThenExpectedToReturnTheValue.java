package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedNext_WhenPriceIsZeroThenExpectedToReturnTheValue {

    @Test
    public void next_WhenPriceIsZeroThenExpectedToReturnTheValue() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 0;
        int expectedValue = 1;
        int actualValue = instance.next(price);
        assertEquals(expectedValue, actualValue);
    }

}