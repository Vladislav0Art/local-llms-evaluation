package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextNonEmptyStackTest {

    @Test
    public void nextNonEmptyStackTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(80);
        int result = span.next(100);
        assertEquals(2, result);
    }

}