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
public class GeneratedNext_Price_LowerThanSomePreviousAddToStackAndReturnDifference {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();
    @Mock
    private List<Integer> mockList;

    public void setMockList(List<Integer> mockList) {
        this.mockList = mockList;
    }

    @Test
    public void next_Price_LowerThanSomePreviousAddToStackAndReturnDifference() throws Exception {
        // arrange
        stockSpan.list = mockList;
        mockList.add(5);
        mockList.add(3);

        // act
        int result = stockSpan.next(2);
        assertEquals(1, result);
    }

}