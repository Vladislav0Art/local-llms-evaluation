package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedNext_SinglePrice {

    @Test
    public void next_SinglePrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 1;
        int actual = stock.next(price);
        assertEquals(1, actual);
    }

    @ParameterizedTest
    @CsvSource({
            "2",
            "3"
    })
    public void next_MultiplePrices(int price) {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {price};
        int actual = stock.next(price);
        assertEquals(1, actual);
    }

}