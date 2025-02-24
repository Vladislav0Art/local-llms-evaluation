package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNextTest {

    @Mock
    private List<Integer> mockPriceList;

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void nextTest() {
        int price = 10;
        int expected = 1;

        assertEquals(expected, onlineStockSpan.next(price));
    }

}