package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedTest {

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

    @Test
    public void calculateSpans_SinglePrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 2;
        int[] prices = {price};
        int[] expected = {1, 1};
        int actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void calculateSpans_MultiplePrices() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {2, 3};
        int[] expected = {2, 4};
        int[] actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void calculateSpans_MultiplePrices_InvalidPrice() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = -100;
        int[] prices = {2, 3};
        int[] expected = {-100, 0};
        int actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @ParameterizedTest
    @CsvSource({
            "1,0",
            "2,1"
    })
    public void calculateSpans_MultiplePrices_SufficientLineCoverage(int price, int span) {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {price};
        int[] expected = {1, 2};
        int actual = stock.calculateSpans(prices);
        assertEquals(expected[0], actual[0]);
        assertEquals(expected[1], actual[1]);
    }

    @Test
    public void next_SufficientLineCoverage() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int price = 10;
        int actual = stock.next(price);
        assertEquals(3, actual);
    }

    @Test
    public void calculateSpans_SufficientLineCoverage() {
        OnlineStockSpan stock = new OnlineStockSpan();
        int[] prices = {2, 3};
        int[][] expected = {{1, 4}, {6}};
        int[][] actual = stock.calculateSpans(prices);
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i][0], actual[i][0]);
            assertEquals(expected[i][1], actual[i][1]);
        }
    }

    @ParameterizedTest
    @CsvSource({
            "100,10",
            "500,50"
    })
    public void calculateSpans_InvalidPrice_MultipleStocks(int price, int span) {
        OnlineStockSpan stock1 = new OnlineStockSpan();
        OnlineStockSpan stock2 = new OnlineStockSpan();
        stock1.next(price);
        stock2.next(100);
        int[][] expected = {{1, 2}, {6}};
        int[][] actual = stock1.calculateSpans(new int[]{price});
        for (int i = 0; i < expected.length; i++) {
            assertEquals(expected[i][0], actual[i][0]);
            assertEquals(expected[i][1], actual[i][1]);
        }
    }

}