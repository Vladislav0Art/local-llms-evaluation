package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_EmptyStack_ReturnsZero {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_EmptyStack_ReturnsZero() {
        int result = onlineStockSpan.next(10);
        assertEquals(0, result);
    }

}