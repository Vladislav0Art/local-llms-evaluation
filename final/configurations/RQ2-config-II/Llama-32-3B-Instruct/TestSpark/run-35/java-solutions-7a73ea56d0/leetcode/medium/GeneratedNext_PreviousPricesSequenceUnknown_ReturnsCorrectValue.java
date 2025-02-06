package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PreviousPricesSequenceUnknown_ReturnsCorrectValue {

    @Test
    public void next_PreviousPricesSequenceUnknown_ReturnsCorrectValue() {
        int price = 10;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        for (int i = 0; i < 6; i++) {
            stockSpan.next(i * 10);
        }
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

}