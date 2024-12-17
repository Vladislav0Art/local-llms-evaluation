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
public class GeneratedNext_DifferentPrice_ReturnsDifferentCount {

    private OnlineStockSpan stockSpan = new OnlineStockSpan();

    @Test
    public void next_DifferentPrice_ReturnsDifferentCount() {
        // Given
        int price1 = 10;
        int price2 = 20;
        List<Integer> list = new ArrayList<>();
        stack();
        Mockito.when(list.get(Mockito.anyInt())).thenReturn(price1).thenReturn(price2);

        // When
        int actualCount = stockSpan.next(price2);
        verifyNoMoreInteractions(list, stack());

        // Then
        assertEquals(2, actualCount);
    }

}