package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestCalculateSpans_InvalidPrice {

    @ParameterizedTest
    @CsvSource({
            "0,1,2",
            "3,9,27"
    })
    public void testNext_SimpleScenario(int price) {
        OnlineStockSpan instance = new OnlineStockSpan();
        int actual = instance.next(price);
        int expected = 2;
        assert actual == expected : "Expected next(3) to return 2";
    }

    @ParameterizedTest
    @CsvSource({
            "10,7,6",
            "-9,-4,0"
    })
    public void testNext_InvalidInput(int price) {
        OnlineStockSpan instance = new OnlineStockSpan();
        int actual = instance.next(price);
        int expected = -1;
        assert actual == expected : "Expected next(-9) to return -1";
    }

    @ParameterizedTest
    @CsvSource({
            "-10,7,6",
            "-9,-4,0"
    })
    public void testNext_InvalidPrice(int price) {
        OnlineStockSpan instance = new OnlineStockSpan();
        int actual = instance.next(price);
        assert actual == -1 : "Expected next(-10) to return -1";
    }

    @Test
    public void testCalculateSpans_InvalidPrice() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {-10, 7};
        OnlineStockSpan.Span[] actual = instance.calculateSpans(prices);
        assert actual.length == 2 : "Expected calculateSpans(1) to return 3";
    }

}