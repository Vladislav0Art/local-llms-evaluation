package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_SamePrice_ReturnsSameCount {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_SamePrice_ReturnsSameCount() {
        // Given
        int price = 10;
        List<Integer> list = new ArrayList<>();
        stack();
        Mockito.when(list.get(Mockito.anyInt())).thenReturn(price);

        // When
        int actualCount = stockSpan.next(price);
        verifyNoMoreInteractions(list, stack());

        // Then
        assertEquals(1, actualCount);
    }

}