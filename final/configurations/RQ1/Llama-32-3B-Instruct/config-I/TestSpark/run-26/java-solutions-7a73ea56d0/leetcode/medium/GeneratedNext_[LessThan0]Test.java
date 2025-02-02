package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_[LessThan0]

Test {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Mock
    private List<Integer> list;

    @Mock
    private Stack<Integer> indexStack;

    @Test
    public void next_[ LessThan0]Test() {
        when(list.size()).thenReturn(0);
        when(indexStack.isEmpty()).thenReturn(true);
        assertThrows(IndexOutOfBoundsException.class, () -> underTest.next(-1));
    }

}