package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_2_Series_Returns_2 {

    private OnlineStockSpan subject = new OnlineStockSpan();

    @Test
    public void testNext_2_Series_Returns_2() {
        int[] prices = {2, 6};
        when(subject.next(2)).thenReturn(1);
        when(subject.next(6)).thenReturn(3);
        when(subject.next(10)).thenReturn(4);
        result = subject.next(10);
        Mockito.verify(subject).next(Mockito.eq(10));
    }

}