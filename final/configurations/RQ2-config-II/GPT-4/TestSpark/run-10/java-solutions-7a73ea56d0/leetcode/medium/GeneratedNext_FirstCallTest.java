package leetcode.medium;

import leetcode.medium.OnlineStockSpan;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedNext_FirstCallTest {

    @Test
    public void next_FirstCallTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int price = 100;
        int expectedSpan = 1;

        assertEquals(expectedSpan, stockSpan.next(price));
    }

}