package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextSinglePriceTest {

    @Test
    public void nextSinglePriceTest() {
        OnlineStockSpan spanCalculator = new OnlineStockSpan();

        int span = spanCalculator.next(100);

        assertEquals(1, span);
    }

}