package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedNext_WhenPriceIsPositiveAndZeroThenExpectedToThrow_NonNegativeZeroException {

    @Test
    public void next_WhenPriceIsPositiveAndZeroThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(0)).thenReturn(1);
        try {
            int price = 0;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

}