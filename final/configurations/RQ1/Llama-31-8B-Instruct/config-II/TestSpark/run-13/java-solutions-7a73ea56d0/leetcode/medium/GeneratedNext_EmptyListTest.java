package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_EmptyListTest {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void next_EmptyListTest() {
        assertEquals(0, onlineStockSpan.list.size());
    }

}