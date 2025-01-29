package leetcode.medium;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.params.provider.CsvSource.*;

public class GeneratedTest {

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
    public void testCalculateSpans_SinglePrice() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price = 5;
        int[] result = instance.calculateSpans(price);
        assert Arrays.equals(result, new int[]{1});
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

    @Test
    public void testCalculateSpansMultiplePricesWithNegative() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = -5;
        int price2 = -10;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{-1});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithZero() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = 0;
        int price2 = 10;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{1});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithNegativeTwo() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = -5;
        int price2 = -10;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{-1, 0});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithNegativeThree() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = -5;
        int price2 = -10;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{-1, 0});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithZeroTwo() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = 10;
        int price2 = -5;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{1});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithZeroThree() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = 10;
        int price2 = -5;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{1});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithNegativeTwoThree() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = -10;
        int price2 = 5;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{-1});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithNegativeThreeTwo() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = -10;
        int price2 = 5;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{-1});
    }

    @Test
    public void testCalculateSpansMultiplePricesWithNegativeOneThree() {
        returnOnlineStockSpan instance = new OnlineStockSpan();
        int price1 = -10;
        int price2 = 5;
        int[] result = instance.calculateSpans(price1);
        assert Arrays.equals(result, new int[]{0});
    }

}