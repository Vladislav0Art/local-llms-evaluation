package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_IncreasingPricesTest {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_IncreasingPricesTest() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(30);
        assertEquals(3, onlineStockSpan.list.size());
        assertEquals(10, onlineStockSpan.list.get(0));
        assertEquals(20, onlineStockSpan.list.get(1));
        assertEquals(30, onlineStockSpan.list.get(2));
    }

}