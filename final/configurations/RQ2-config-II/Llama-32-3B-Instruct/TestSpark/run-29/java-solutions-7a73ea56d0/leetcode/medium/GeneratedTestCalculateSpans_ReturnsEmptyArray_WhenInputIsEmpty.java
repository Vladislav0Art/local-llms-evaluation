package leetcode.medium;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(org.junit.runners.JUnit4.class)
public class GeneratedTestCalculateSpans_ReturnsEmptyArray_WhenInputIsEmpty {

    private OnlineStockSpan onlineStockSpan;

    @Before
    public void setUp() {
        onlineStockSpan = new OnlineStockSpan();
    }

    // [calculateSpans]Test

    @Test
    public void testCalculateSpans_ReturnsEmptyArray_WhenInputIsEmpty() {
        List<Integer> result = onlineStockSpan.calculateSpans(new int[0]);
        assertTrue(result.isEmpty());
    }

}