package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedNext_WhenPriceIsPositiveAndOneThenExpectedToThrow_NonNegativeZeroException {

    @Test
    public void next_WhenPriceIsPositiveAndOneThenExpectedToThrow_NonNegativeZeroException() {
        OnlineStockSpan instance = new OnlineStockSpan();
        Mockito.when(instance.next(1)).thenReturn(0);
        try {
            int price = 2;
            int actualValue = instance.next(price);
            fail("Expected NonNegativeZeroException");
        } catch (NonNegativeZeroException e) {
        }
    }

}