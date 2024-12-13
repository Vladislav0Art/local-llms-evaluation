package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_WithDuplicates_ReturnsCount {

    @Test
    public void next_WithDuplicates_ReturnsCount() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        stockSpan.next(10);
        stockSpan.next(20);
        stockSpan.next(20);
        stockSpan.next(30);
        int result = stockSpan.next(30);
        assertEquals(1, result);
    }

}