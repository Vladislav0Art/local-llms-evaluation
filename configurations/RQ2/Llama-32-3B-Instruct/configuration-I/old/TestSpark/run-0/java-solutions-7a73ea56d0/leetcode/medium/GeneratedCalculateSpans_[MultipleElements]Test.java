package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_[MultipleElements]

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
    public void calculateSpans_[ MultipleElements]Test() {
        when(pricesMock[0]).thenReturn(priceMock1);
        when(pricesMock[1]).thenReturn(priceMock2);
        when(pricesMock[2]).thenReturn(priceMock3);

        int[] result = onlineStockSpan.calculateSpans(new int[]{priceMock1, priceMock2, priceMock3});
        assertNotNull(result);
        assertEquals(3, result.length);
    }

}