package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_PopFromStackTest {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_PopFromStackTest() {
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        assertEquals(1, onlineStockSpan.next(15));
    }

}