package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_PriceArray_MultipleElementsReturnCorrectSpans {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();
    @Mock
    private List<Integer> mockList;

    public void setMockList(List<Integer> mockList) {
        this.mockList = mockList;
    }

    @Test
    public void calculateSpans_PriceArray_MultipleElementsReturnCorrectSpans() {
        // arrange
        when(stockSpan.list).thenReturn(mockList);
        mockList.add(10);
        mockList.add(5);
        mockList.add(8);
        stockSpan.list = mockList;
        when(stockSpan.prices).thenReturn(new int[]{10, 5, 8});

        // act
        int[] result = stockSpan.calculateSpans(prices);

        // assert
        assertEquals(new int[]{1, 4, 2}, result);
    }

}