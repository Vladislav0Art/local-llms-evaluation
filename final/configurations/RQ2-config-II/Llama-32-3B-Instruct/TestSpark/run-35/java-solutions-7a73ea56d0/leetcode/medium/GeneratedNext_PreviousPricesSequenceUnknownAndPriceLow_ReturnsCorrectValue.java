package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PreviousPricesSequenceUnknownAndPriceLow_ReturnsCorrectValue {

    @Test
    public void next_PreviousPricesSequenceUnknownAndPriceLow_ReturnsCorrectValue() {
        int price = 5;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        for (int i = 0; i < 6; i++) {
            stockSpan.next(i * 20);
        }
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

}