package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice returnsSpanAfterDecreasing {

    @Test
    public void nextPrice

    returnsSpanAfterDecreasing() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 2;
        int priceBefore = 3;
        stockSpan.next(priceBefore);
        int expectedSpan = 4;
        int actualSpan = stockSpan.next(price);
        assertThat(actualSpan, is(expectedSpan));
    }

}