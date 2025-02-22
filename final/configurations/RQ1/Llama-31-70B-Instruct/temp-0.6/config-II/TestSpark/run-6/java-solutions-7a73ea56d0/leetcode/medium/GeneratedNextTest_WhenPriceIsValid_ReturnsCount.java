package leetcode.medium;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.when;

public class GeneratedNextTest_WhenPriceIsValid_ReturnsCount {

    @Test
    public void nextTest_WhenPriceIsValid_ReturnsCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();

        int count = stockSpan.next(10);
        Assert.assertEquals(1, count);
    }

}