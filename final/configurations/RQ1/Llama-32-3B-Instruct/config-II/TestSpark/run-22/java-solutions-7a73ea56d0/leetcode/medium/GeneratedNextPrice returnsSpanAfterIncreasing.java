package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice returnsSpanAfterIncreasing {

    @Test
    public void nextPrice

    returnsSpanAfterIncreasing() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 2;
        int priceBefore = 1;
        stockSpan.next(priceBefore);
        int expectedSpan = 1;
        int actualSpan = stockSpan.next(price);
        assertThat(actualSpan, is(expectedSpan));
    }

}