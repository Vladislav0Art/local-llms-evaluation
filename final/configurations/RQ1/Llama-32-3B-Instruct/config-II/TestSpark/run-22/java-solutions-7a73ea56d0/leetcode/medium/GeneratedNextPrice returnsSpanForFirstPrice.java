package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class GeneratedNextPrice returnsSpanForFirstPrice {

    @Test
    public void nextPrice

    returnsSpanForFirstPrice() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 1;
        int expectedSpan = 1;
        int actualSpan = stockSpan.next(price);
        assertThat(actualSpan, is(expectedSpan));
    }

}