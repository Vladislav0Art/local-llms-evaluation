package leetcode.medium;

import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;

public class GeneratedNextTest1 {

    @Test
    public void nextTest1() {
        OnlineStockSpan oss = new OnlineStockSpan();
        assertThat(oss.next(2), is(1));
        assertThat(oss.next(3), is(2));
        assertThat(oss.next(1), is(1));
    }

}