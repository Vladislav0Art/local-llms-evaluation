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
public class GeneratedNext_NonEmptyList_ReturnsCorrectCount {

    @Mock
    private Stack<Integer> indexStack;

    private OnlineStockSpan onlineStockSpan = new OnlineStockSpan();

    @Test
    public void next_NonEmptyList_ReturnsCorrectCount() {
        // given
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(6);
        when(indexStack.isEmpty()).thenReturn(false);

        onlineStockSpan.list = list;

        // when
        int result = onlineStockSpan.next(7);
        // then
        assertEquals(2, result);
    }

}