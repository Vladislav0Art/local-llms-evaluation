package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_PriceIsLowerThanStackTop_Returns1 {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_PriceIsLowerThanStackTop_Returns1() {
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(10);
        assertEquals(1, result);
    }

}