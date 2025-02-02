package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedCalculateSpans_HigherPriceFromLeft_ReturnsCorrectSpan {

    private int index = 0;

    public int next(int price) {
        index++;
        return index;
    }

    public List<Integer> calculateSpans() {
        List<Integer> result = new ArrayList<>();
        for (int i = 1; i <= index; i++) {
            result.add(index + 1);
        }
        return result;
    }
}

public class OnlineStockSpanTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    public void setup() {
        Mockito.when(onlineStockSpan.next(Mockito.anyInt())).thenReturn(0);
        Mockito.when(onlineStockSpan.list(Mockito.anyInt())).thenReturn(Mockito.anyList());
    }

    @Test
    public void calculateSpans_HigherPriceFromLeft_ReturnsCorrectSpan() {
        setup();
        onlineStockSpan.list.add(50);
        onlineStockSpan.next(75);
        onlineStockSpan.next(100);

        int[] result = {1, 3, 4, 2};
        org.junit.Assert.assertArrayEquals(result, new int[]{onlineStockSpan.calculateSpans().get(0), onlineStockSpan.calculateSpans().get(1)});
    }

}