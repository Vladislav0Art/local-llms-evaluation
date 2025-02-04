package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_SamePrice_ReturnsCount {

    @Mock
    private List<Integer> list;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_SamePrice_ReturnsCount() {
        when(list.size()).thenReturn(10);
        when(list.get(0)).thenReturn(12);
        when(list.get(anyInt())).thenReturn(9);

        onlineStockSpan.list = list;
        int actual = onlineStockSpan.next(11);
        assertEquals(1, actual);
    }

}