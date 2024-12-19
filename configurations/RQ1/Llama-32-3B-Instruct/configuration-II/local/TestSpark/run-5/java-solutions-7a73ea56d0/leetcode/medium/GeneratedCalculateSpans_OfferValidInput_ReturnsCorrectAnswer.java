package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedCalculateSpans_OfferValidInput_ReturnsCorrectAnswer {

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void calculateSpans_OfferValidInput_ReturnsCorrectAnswer() {
        int[] prices = {100, 80, 75, 70, 60, 70};
        int[] expectedResult = {1, 1, 2, 3, 4, 5};
        int[] actualResult = onlineStockSpan.calculateSpans(prices);
        assertArrayEquals(expectedResult, actualResult);
    }

}