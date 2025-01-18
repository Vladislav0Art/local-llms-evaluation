package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextLessThanStackTopTest {

    @Test
    public void nextLessThanStackTopTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        span.next(100);
        int result = span.next(80);
        assertEquals(1, result);
    }

}