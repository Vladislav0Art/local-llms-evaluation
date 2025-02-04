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
public class GeneratedNext_EmptyList_ReturnsCount {

    @Mock
    private List<Integer> list;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_EmptyList_ReturnsCount() {
        when(list.size()).thenReturn(0);

        onlineStockSpan.list = list;
        int actual = onlineStockSpan.next(10);
        assertEquals(1, actual);
    }

}