package leetcode.medium;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GeneratedTestNext_1_Series_Returns_1 {

    private OnlineStockSpan subject = new OnlineStockSpan();

    @Test
    public void testNext_1_Series_Returns_1() {
        int[] prices = {2, 6};
        when(subject.next(2)).thenReturn(1);
        when(subject.next(6)).thenReturn(3);
        int result = subject.next(2);
        Mockito.verify(subject).next(Mockito.eq(2));
    }

}