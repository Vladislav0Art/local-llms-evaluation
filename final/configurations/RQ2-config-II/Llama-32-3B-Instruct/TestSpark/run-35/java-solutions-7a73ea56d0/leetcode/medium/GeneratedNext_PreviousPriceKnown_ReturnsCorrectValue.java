package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PreviousPriceKnown_ReturnsCorrectValue {

    @Test
    public void next_PreviousPriceKnown_ReturnsCorrectValue() {
        int price = 20;
        int prevPrice = 15;
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(prevPrice);
        int result = stockSpan.next(price);
        assertEquals(2, result);
    }

}