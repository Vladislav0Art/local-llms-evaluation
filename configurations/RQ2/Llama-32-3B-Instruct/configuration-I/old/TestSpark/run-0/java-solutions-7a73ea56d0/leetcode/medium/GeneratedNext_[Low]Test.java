package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_[Low]

Test {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Mock
    private int[] pricesMock;

    @Mock
    private int priceMock1;

    @Mock
    private int priceMock2;

    @Test
    public void next_[ Low]Test() {
        when(pricesMock[0]).thenReturn(priceMock1);
        assertEquals(1, onlineStockSpan.next(priceMock1));
    }

}