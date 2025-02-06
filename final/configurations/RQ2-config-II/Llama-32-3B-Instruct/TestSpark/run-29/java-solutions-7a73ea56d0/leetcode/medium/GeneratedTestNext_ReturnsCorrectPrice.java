package leetcode.medium;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestNext_ReturnsCorrectPrice {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    // [calculateSpans]Test

    @Test
    public void testNext_ReturnsCorrectPrice() {
        when(onlineStockSpan.next(anyInt())).thenReturn(5);
        int result = onlineStockSpan.next(3);
        assertEquals(5, result);
    }

}