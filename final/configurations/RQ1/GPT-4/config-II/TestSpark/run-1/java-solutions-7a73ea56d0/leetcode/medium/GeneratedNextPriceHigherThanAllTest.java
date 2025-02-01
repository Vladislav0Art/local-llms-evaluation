package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextPriceHigherThanAllTest {

    @Test
    public void nextPriceHigherThanAllTest() {
        OnlineStockSpan os = new OnlineStockSpan();
        os.next(10);
        os.next(15);
        os.next(12);
        int result = os.next(20);
        assertEquals(4, result);
    }

}