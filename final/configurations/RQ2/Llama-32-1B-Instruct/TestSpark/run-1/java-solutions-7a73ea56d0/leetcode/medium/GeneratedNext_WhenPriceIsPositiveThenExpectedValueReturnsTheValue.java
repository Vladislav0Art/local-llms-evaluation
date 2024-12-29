package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedNext_WhenPriceIsPositiveThenExpectedValueReturnsTheValue {

    @Test
    public void next_WhenPriceIsPositiveThenExpectedValueReturnsTheValue() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int price = 10;
        int expectedValue = 1;
        int actualValue = instance.next(price);
        assertEquals(expectedValue, actualValue);
    }

}