package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTestCalculateSpans_SimpleScenario {

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
    public void testCalculateSpans_SimpleScenario() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {3, 9, 27};
        int[] expected = {2, 6, 23};
        OnlineStockSpan.Span[] actual = instance.calculateSpans(prices);
        assert actual.length == 3 : "Expected calculateSpans(1) to return 3";
        for (int i = 0; i < 3; i++) {
            assert actual[i].equals(expected[i]) : "Expected calculateSpans(1) to match the expected output";
        }
    }

    @ParameterizedTest
    @CsvSource({
            "-10,7,-6"
    })
    public void testCalculateSpans_InvalidInput(int price, int[] expected) {
        OnlineStockSpan instance = new OnlineStockSpan();
        int actual = instance.calculateSpans(price);
        assert actual.equals(-1) : "Expected calculateSpans(-10) to return -1";
    }

}