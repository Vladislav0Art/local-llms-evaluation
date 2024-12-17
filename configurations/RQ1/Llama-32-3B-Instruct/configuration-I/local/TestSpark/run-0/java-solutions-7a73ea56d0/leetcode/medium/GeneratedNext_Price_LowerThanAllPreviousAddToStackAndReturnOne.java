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
public class GeneratedNext_Price_LowerThanAllPreviousAddToStackAndReturnOne {

    private final OnlineStockSpan stockSpan = new OnlineStockSpan();
    @Mock
    private List<Integer> mockList;

    public void setMockList(List<Integer> mockList) {
        this.mockList = mockList;
    }

    @Test
    public void next_Price_LowerThanAllPreviousAddToStackAndReturnOne() throws Exception {
        // arrange
        stockSpan.list = mockList;
        mockList.add(5);

        // act
        int result = stockSpan.next(1);
        assertEquals(1, result);
    }

}