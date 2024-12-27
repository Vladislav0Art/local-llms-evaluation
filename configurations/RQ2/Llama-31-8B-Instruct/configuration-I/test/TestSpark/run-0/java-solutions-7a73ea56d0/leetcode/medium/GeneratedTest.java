package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

import java.util.Arrays;

import org.mockito.InjectMocks;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_EmptyStackTest() {
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        verify(onlineStockSpan).next(10);
        verifyNoMoreInteractions(onlineStockSpan);
    }

    @Test
    public void next_PushToStackTest() {
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        verify(onlineStockSpan).next(10);
        verify(onlineStockSpan).next(20);
        verifyNoMoreInteractions(onlineStockSpan);
    }

    @Test
    public void next_PopFromStackTest() {
        onlineStockSpan = new OnlineStockSpan();
        onlineStockSpan.next(10);
        onlineStockSpan.next(20);
        onlineStockSpan.next(15);
        verify(onlineStockSpan).next(10);
        verify(onlineStockSpan).next(20);
        verify(onlineStockSpan).next(15);
        verifyNoMoreInteractions(onlineStockSpan);
    }

    @Test
    public void calculateSpans_EmptyArrayTest() {
        onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{});
        assertArrayEquals(new int[]{}, result);
    }

    @Test
    public void calculateSpans_SingleElementArrayTest() {
        onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

    @Test
    public void calculateSpans_IncreasingArrayTest() {
        onlineStockSpan = new OnlineStockSpan();
        int[] result = onlineStockSpan.calculateSpans(new int[]{10, 20, 30, 40, 50});
        assertArrayEquals(new int[]{1, 1, 1, 1, 1
        }

    }