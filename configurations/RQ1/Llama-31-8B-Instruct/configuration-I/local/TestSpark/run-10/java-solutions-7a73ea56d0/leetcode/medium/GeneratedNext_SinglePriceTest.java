package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_SinglePriceTest {

    @Test
    public void next_SinglePriceTest() {
        OnlineStockSpan stockSpan = new OnlineStockSpan();
        stockSpan.next(10);
        assertEquals(1, stockSpan.list.size());
        assertEquals(10, (int) stockSpan.list.get(0));
        assertEquals(1, stockSpan.next(10));
    }

}