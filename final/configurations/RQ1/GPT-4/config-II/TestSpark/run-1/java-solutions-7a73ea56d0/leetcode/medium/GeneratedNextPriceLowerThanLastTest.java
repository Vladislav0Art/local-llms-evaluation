package leetcode.medium;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import leetcode.medium.OnlineStockSpan;

public class GeneratedNextPriceLowerThanLastTest {

    @Test
    public void nextPriceLowerThanLastTest() {
        OnlineStockSpan os = new OnlineStockSpan();
        os.next(10);
        int result = os.next(5);
        assertEquals(1, result);
    }

}