package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;

@RunWith(JUnit4.class)
public class GeneratedNextTest {

    @Test
    public void nextTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        assertEquals(0, stockSpan.next(10));
        assertEquals(1, stockSpan.next(20));
        assertEquals(1, stockSpan.next(30));
    }

}