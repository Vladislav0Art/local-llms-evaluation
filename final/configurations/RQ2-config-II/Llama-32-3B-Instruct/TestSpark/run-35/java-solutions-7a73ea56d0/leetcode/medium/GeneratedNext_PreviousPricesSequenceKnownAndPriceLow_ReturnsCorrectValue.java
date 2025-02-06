package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PreviousPricesSequenceKnownAndPriceLow_ReturnsCorrectValue {

    @Test
    public void next_PreviousPricesSequenceKnownAndPriceLow_ReturnsCorrectValue() {
        int price = 5;
        int prevPrice1 = 10;
        int prevPrice2 = 15;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        stockSpan.next(prevPrice1);
        stockSpan.next(prevPrice2);
        for (int i = 0; i < 6; i++) {
            stockSpan.next(i * 20);
        }
        int result = stockSpan.next(price);
        assertEquals(3, result);
    }

}