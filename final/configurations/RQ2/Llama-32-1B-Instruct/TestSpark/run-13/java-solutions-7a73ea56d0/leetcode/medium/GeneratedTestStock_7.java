package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestStock_7 {

    @Test
    public void testStock_7() {
        Stock stock = new Stock();
        assertThat(stock.getStockPrice(0), is(-6));
        assertThat(stock.getStockPrice(4), is(-6));
        assertThat(stock.getStockPrice(8), is(-6));
        assertThat(stock.getStockPrice(11), is(-6));
    }

}