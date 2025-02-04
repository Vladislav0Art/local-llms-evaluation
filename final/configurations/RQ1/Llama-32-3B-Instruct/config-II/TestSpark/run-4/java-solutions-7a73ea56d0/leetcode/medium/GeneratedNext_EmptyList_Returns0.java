package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_EmptyList_Returns0 {

    @Mock
    private Stack<Integer> indexStack;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_EmptyList_Returns0() {
        // given
        when(indexStack.isEmpty()).thenReturn(true);

        // when
        int result = onlineStockSpan.next(10);
        // then
        assertEquals(0, result);
    }

}