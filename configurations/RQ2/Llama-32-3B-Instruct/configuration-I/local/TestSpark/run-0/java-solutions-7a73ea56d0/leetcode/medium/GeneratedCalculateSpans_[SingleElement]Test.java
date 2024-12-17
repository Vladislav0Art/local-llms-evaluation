package leetcode.medium;

import org.junit.Test;

import static org.junit.Assert.*;

import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_[SingleElement]

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
    public void calculateSpans_[ SingleElement]Test() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{priceMock1});
        assertNotNull(result);
        assertEquals(1, result.length);
    }

}