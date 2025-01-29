package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestStock_1 {

    @Test
    public void testStock_1() {
        Stock stock = new Stock();
        assertThat(stock.getStockPrice(0), is(0));
        assertThat(stock.getStockPrice(4), is(0));
        assertThat(stock.getStockPrice(8), is(0));
        assertThat(stock.getStockPrice(11), is(0));
    }

}