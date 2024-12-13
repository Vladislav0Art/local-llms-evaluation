package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_DecreasingList_ReturnsCount {

    @Test
    public void next_DecreasingList_ReturnsCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(40);
        stockSpan.next(30);
        stockSpan.next(20);
        stockSpan.next(10);
        int result = stockSpan.next(5);
        assertEquals(4, result);
    }

}