package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.params.provider.CsvSource.*;

public class GeneratedTestCalculateSpansMultiplePrices {

    @ParameterizedTest
    @CsvSource({
            "-10,7,-6",
            "3,9,27"
    })
    public void testNext_SimpleScenario(int price) {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int actual = instance.next(price);
        int expected = 2;
        assert actual == expected : "Expected next(3) to return 2";
    }

    @ParameterizedTest
    @CsvSource({
            "-10,7,-6",
            "3,9,27"
    })
    public void testNext_InvalidInput(int price) {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int actual = instance.next(price);
        int expected = -1;
        assert actual == expected : "Expected next(-10) to return -1";
    }

    @ParameterizedTest
    @CsvSource({
            "-100,5,-6",
            "3,9,27"
    })
    public void testNext_InvalidInput2(int price) {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int actual = instance.next(price);
        int expected = -1;
        assert actual == expected : "Expected next(-100) to return -1";
    }

    @Test
    public void testCalculateSpansMultiplePrices() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = 5;
        int price2 = 10;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{1});
        result = instance.calculateSpans(price2);
        assert Arrays.equals(result, new int[]{1, 1});
    }

}