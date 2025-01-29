package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTest {

    @ParameterizedTest
    @CsvSource({
            "1,2",
            "2,3",
            "5,10"
    })
    public void next_SimpleTestCase(int price, int expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "1.0,-1.0",
            "2.0,1.4"
    })
    public void next_SingleDataTestCase(double price, double expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "-100,-101",
            "0,1.2"
    })
    public void next_SingleIntTestCase(int price, int expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "-100,-101",
            "0,1.2"
    })
    public void next_SingleDoubleTestCase(double price, double expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "-100,-101",
            "0,1.2"
    })
    public void next_SingleLongTestCase(long price, long expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "-100,-101",
            "0,1.2"
    })
    public void next_SingleBooleanTestCase(boolean price, boolean expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "-100,-101",
            "0,1.2"
    })
    public void next_SingleCharTestCase(char price, char expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "-100,-101",
            "0,1.2"
    })
    public void next_SingleStringTestCase(String price, String expectedPrice) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrice, instance.next(price));
    }

    @ParameterizedTest
    @CsvSource({
            "-100,-101",
            "0,1.2"
    })
    public void next_SingleArrayTestCase(String price, String[] expectedPrices) {
        OnlineStockSpan instance = new OnlineStockSpan();
        assertEquals(expectedPrices[0], instance.next(price));
        assertEquals(expectedPrices[1], instance.next(price));
    }

    @Test
    public void next_MultipleDataCases() {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] prices = {10, 22, 5};
        int[] expectedSpans = new int[]{1, 2, 3};
        OnlineStockSpan.SpanCalculateMethod method = instance.calculateSpans(prices);
        assertEquals(expectedSpans, method.getSpans());
    }

    @ParameterizedTest
    @CsvSource({
            "1000,1000",
            "-100,-101"
    })
    public void calculate_SimpleTestCase(int[] prices, int expectedSpans) {
        OnlineStockSpan instance = new OnlineStockSpan();
        int[] actualSpans = instance.calculateSpans(prices);
        assertEquals(expectedSpans, getArraySize(actualSpans));
    }

    private int getArraySize(int[] array) {
        return array.length;
    }

}