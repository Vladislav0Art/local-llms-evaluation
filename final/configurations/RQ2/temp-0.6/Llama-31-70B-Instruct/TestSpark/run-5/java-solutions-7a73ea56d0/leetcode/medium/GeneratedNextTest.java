package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextTest {

    @Mock
    private List<Integer> mockList;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void nextTest() {
        when(mockList.get(0)).thenReturn(1);
        assertEquals(1, onlineStockSpan.next(1));
    }

}