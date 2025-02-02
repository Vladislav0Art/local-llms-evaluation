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
public class GeneratedNext_[AscendingPrice]

Test {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Mock
    private List<Integer> list;

    @Mock
    private Stack<Integer> indexStack;

    @Test
    public void next_[ AscendingPrice]Test() {
        List<Integer> temp = new ArrayList<>();
        temp.add(-5);
        temp.add(0);
        temp.add(3);
        when(list).thenReturn(temp);
        int[] result = underTest.next(new int[]{10, 7, 2});
        assertEquals(4, result[0]);
    }

}