package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNextMultiplePricesTest {

    @Test
    public void nextMultiplePricesTest() {
        OnlineStockSpan spanCalculator = new OnlineStockSpan();

        int span1 = spanCalculator.next(100);
        int span2 = spanCalculator.next(80);
        int span3 = spanCalculator.next(60);
        int span4 = spanCalculator.next(70);
        int span5 = spanCalculator.next(60);
        int span6 = spanCalculator.next(75);
        int span7 = spanCalculator.next(85);

        assertEquals(1, span1);
        assertEquals(1, span2);
        assertEquals(1, span3);
        assertEquals(2, span4);
        assertEquals(1, span5);
        assertEquals(4, span6);
        assertEquals(6, span7);
    }

}