package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedTest {

    @Mock
    private List<Integer> mockList;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void nextTest() {
        when(mockList.get(0)).thenReturn(1);
        assertEquals(1, onlineStockSpan.next(1));
    }

    @Test
    public void calculateSpansTest() {
        int[] prices = {1, 2, 3, 4, 5};
        int[] result = onlineStockSpan.calculateSpans(prices);
        assertEquals(1, result[0]);
        assertEquals(2, result[1]);
        assertEquals(3, result[2]);
        assertEquals(4, result[3]);
        assertEquals(5, result[4]);
    }

}