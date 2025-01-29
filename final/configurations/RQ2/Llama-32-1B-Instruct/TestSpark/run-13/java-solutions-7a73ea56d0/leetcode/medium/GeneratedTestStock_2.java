package leetcode.medium;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class GeneratedTestStock_2 {

    @Test
    public void testStock_2() {
        Stock stock = new Stock();
        assertThat(stock.getStockPrice(0), is(-1));
        assertThat(stock.getStockPrice(4), is(-1));
        assertThat(stock.getStockPrice(8), is(-1));
        assertThat(stock.getStockPrice(11), is(-1));
    }

}