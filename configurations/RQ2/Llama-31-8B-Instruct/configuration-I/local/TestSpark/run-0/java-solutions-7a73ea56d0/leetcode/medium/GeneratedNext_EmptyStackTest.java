package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_EmptyStackTest {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_EmptyStackTest() {
        onlineStockSpan = new OnlineStockSpan();
        assertEquals(1, onlineStockSpan.next(10));
    }

}