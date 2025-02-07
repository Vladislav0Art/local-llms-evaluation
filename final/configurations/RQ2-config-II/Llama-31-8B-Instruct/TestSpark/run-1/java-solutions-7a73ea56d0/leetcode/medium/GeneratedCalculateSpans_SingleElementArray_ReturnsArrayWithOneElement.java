package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedCalculateSpans_SingleElementArray_ReturnsArrayWithOneElement {

    @InjectMocks
    private OnlineStockSpan onlineStockSpan;

    @Test
    public void calculateSpans_SingleElementArray_ReturnsArrayWithOneElement() {
        int[] result = onlineStockSpan.calculateSpans(new int[]{10});
        assertArrayEquals(new int[]{1}, result);
    }

}