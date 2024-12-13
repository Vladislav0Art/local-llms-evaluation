package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_EmptyList_ReturnsZero {

    @Test
    public void next_EmptyList_ReturnsZero() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        int result = stockSpan.next(10);
        assertEquals(0, result);
    }

}