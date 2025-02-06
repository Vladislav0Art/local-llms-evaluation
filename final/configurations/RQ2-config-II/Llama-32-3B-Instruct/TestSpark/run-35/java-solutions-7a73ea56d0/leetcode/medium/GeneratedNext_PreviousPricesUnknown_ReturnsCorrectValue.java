package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

public class GeneratedNext_PreviousPricesUnknown_ReturnsCorrectValue {

    @Test
    public void next_PreviousPricesUnknown_ReturnsCorrectValue() {
        int price = 10;
        OnlineStockSpan stockSpan = new OnlineStackSpan();
        for (int i = 0; i < 5; i++) {
            stockSpan.next(i * 15);
        }
        int result = stockSpan.next(price);
        assertEquals(1, result);
    }

}