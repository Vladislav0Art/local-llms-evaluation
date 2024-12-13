package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_IncreasingList_ReturnsOne {

    @Test
    public void next_IncreasingList_ReturnsOne() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(30);
        int result = stockSpan.next(40);
        assertEquals(1, result);
    }

}