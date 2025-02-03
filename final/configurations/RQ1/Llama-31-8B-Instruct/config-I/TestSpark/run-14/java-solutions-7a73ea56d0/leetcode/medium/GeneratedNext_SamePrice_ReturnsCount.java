package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_SamePrice_ReturnsCount {

    @Test
    public void next_SamePrice_ReturnsCount() {
        OnlineStockSpan onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        int result = onlineStockSpan.next(10);
        assertEquals(3, result);
    }

}