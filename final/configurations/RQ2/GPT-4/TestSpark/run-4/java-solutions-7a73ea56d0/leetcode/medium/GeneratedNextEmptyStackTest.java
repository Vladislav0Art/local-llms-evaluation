package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;
import leetcode.medium.OnlineStockSpan;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextEmptyStackTest {

    @Test
    public void nextEmptyStackTest() {
        OnlineStockSpan span = new OnlineStockSpan();
        int result = span.next(100);
        assertEquals(1, result);
    }

}