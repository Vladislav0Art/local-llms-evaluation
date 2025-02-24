package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextTest2 {

    @Test
    public void nextTest2() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(1, stockSpan.next(100));
        assertEquals(1, stockSpan.next(90));
        assertEquals(2, stockSpan.next(85));
        assertEquals(3, stockSpan.next(80));
        assertEquals(3, stockSpan.next(85));
        assertEquals(3, stockSpan.next(90));
        assertEquals(4, stockSpan.next(95));
    }

}