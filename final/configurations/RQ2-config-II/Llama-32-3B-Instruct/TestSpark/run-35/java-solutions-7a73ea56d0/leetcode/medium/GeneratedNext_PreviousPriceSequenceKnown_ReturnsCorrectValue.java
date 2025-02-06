package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PreviousPriceSequenceKnown_ReturnsCorrectValue {

    @Test
    public void next_PreviousPriceSequenceKnown_ReturnsCorrectValue() {
        int price = 10;
        int prevPrice1 = 15;
        int prevPrice2 = 20;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        stockSpan.next(prevPrice1);
        stockSpan.next(prevPrice2);
        for (int i = 0; i < 5; i++) {
            stockSpan.next(i * 10);
        }
        int result = stockSpan.next(price);
        assertEquals(4, result);
    }

}