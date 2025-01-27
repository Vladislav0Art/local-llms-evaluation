package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GeneratedNext[Falling]

Test {

    @Test
    public void next[ Falling]Test() {
        OnlineStockSpan s = new OnlineStockSpan();
        int result1 = s.next(100);
        int result2 = s.next(-60);
        int result3 = s.next(-55);
        assertEquals(result1 + 1, s.next(120));
        assertEquals(result2 + 1, s.next(-40));
    }

}