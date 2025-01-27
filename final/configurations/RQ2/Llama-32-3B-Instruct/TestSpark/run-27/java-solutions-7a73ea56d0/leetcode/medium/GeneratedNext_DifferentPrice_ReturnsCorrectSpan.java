package leetcode.medium;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class GeneratedNext_DifferentPrice_ReturnsCorrectSpan {

    @Test
    public void next_DifferentPrice_ReturnsCorrectSpan() {
        OnlineStockSpan underTest = new OnlineStockSpan();
        when(underTest.price).thenReturn(20);
        int result = underTest.next(10);
        assertEquals(2, result);
    }

}