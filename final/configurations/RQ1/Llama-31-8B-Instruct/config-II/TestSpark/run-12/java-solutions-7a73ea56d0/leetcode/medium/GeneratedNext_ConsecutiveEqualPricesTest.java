package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_ConsecutiveEqualPricesTest {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_ConsecutiveEqualPricesTest() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        onlineStockSpan.next(10);
        assertEquals(3, onlineStockSpan.list.size());
        assertEquals(10, onlineStockSpan.list.get(0));
        assertEquals(10, onlineStockSpan.list.get(1));
        assertEquals(10, onlineStockSpan.list.get(2));
    }

}