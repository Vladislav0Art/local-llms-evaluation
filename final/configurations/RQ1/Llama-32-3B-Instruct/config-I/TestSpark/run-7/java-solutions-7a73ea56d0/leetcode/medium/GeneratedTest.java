package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

public class GeneratedTest {

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

    public List<Integer> getList() {
        return list;
    }

    private List<Integer> list;

}

public class OnlineStockSpanTest {

    @Mock
    private OnlineStockSpan onlineStockSpan;

    public void setup() {
        Mockito.when(onlineStockSpan.next(Mockito.anyInt())).thenReturn(0);
        onlineStockSpan.list = Mockito.mock(List.class);
        Mockito.when((List) onlineStockSpan.list(Mockito.anyInt())).thenReturn(Mockito.anyList());
    }

}