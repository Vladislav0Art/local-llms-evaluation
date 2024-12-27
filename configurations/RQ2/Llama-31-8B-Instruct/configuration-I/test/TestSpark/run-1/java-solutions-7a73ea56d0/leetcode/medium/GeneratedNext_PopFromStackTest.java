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
public class GeneratedNext_PopFromStackTest {

    private OnlineStockSpan onlineStockSpan;

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

}