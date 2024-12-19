package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class GeneratedCalculateSpans_SufficientLineCoverage {

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