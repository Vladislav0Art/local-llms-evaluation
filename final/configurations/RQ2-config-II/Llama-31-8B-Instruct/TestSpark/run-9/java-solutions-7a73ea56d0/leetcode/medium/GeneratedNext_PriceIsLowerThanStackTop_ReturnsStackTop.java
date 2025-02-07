package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_PriceIsLowerThanStackTop_ReturnsStackTop {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_PriceIsLowerThanStackTop_ReturnsStackTop() {
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        int result = onlineStockSpan.next(5);
        assertEquals(2, result);
    }

}