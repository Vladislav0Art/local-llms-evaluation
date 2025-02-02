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
public class GeneratedTest {

    private OnlineStockSpan underTest = new OnlineStockSpan();

    @Mock
    private List<Integer> list;

    @Mock
    private Stack<Integer> indexStack;

    @Test
    public void next_[0]

    Test() {
        when(list.size()).thenReturn(0);
        when(indexStack.isEmpty()).thenReturn(true);
        assertEquals(1, underTest.next(10));
    }

    @Test
    public void next_[
    LessThan0]

    Test() {
        when(list.size()).thenReturn(0);
        when(indexStack.isEmpty()).thenReturn(true);
        assertThrows(IndexOutOfBoundsException.class, () -> underTest.next(-1));
    }

    @Test
    public void calculateSpans_[0]

    Test() {
        int[] prices = new int[1];
        prices[0] = 10;
        when(list.size()).thenReturn(0);
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_[
    LessThan0]

    Test() {
        int[] prices = new int[1];
        prices[0] = -10;
        when(list.size()).thenReturn(0);
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        assertThrows(IndexOutOfBoundsException.class, () -> underTest.calculateSpans(prices));
    }

    @Test
    public void next_[
    AscendingPrice]

    Test() {
        List<Integer> temp = new ArrayList<>();
        temp.add(-5);
        temp.add(0);
        temp.add(3);
        when(list).thenReturn(temp);
        int[] result = underTest.next(new int[]{10, 7, 2});
        assertEquals(4, result[0]);
    }

    @Test
    public void next_[
    DescendingPrice]

    Test() {
        List<Integer> temp = new ArrayList<>();
        temp.add(-5);
        temp.add(0);
        temp.add(3);
        when(list).thenReturn(temp);
        int[] result = underTest.next(new int[]{2, 7, 10});
        assertEquals(1, result[0]);
    }

    @Test
    public void calculateSpans_[
    AscendingPrice]

    Test() {
        int[] prices = new int[]{10, 7, 2};
        when(list).thenReturn(new ArrayList<>(underTest.list));
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        when(indexStack.push(anyInt())).thenAnswer((i) -> i);
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1, 3, 4}, result);
    }

    @Test
    public void calculateSpans_[
    DescendingPrice]

    Test() {
        int[] prices = new int[]{2, 7, 10};
        when(list).thenReturn(new ArrayList<>(underTest.list));
        when(indexStack.isEmpty()).thenReturn(true);
        when(indexStack.pop()).thenReturn(0);
        when(indexStack.push(anyInt())).thenAnswer((i) -> i);
        int[] result = underTest.calculateSpans(prices);
        assertEquals(new int[]{1, 2, 3}, result);
    }

}