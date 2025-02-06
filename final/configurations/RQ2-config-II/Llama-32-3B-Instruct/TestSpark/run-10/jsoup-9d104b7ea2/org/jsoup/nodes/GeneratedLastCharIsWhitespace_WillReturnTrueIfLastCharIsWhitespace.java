package org.jsoup.nodes;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

@RunWith(JUnit4.class)
public class GeneratedLastCharIsWhitespace_WillReturnTrueIfLastCharIsWhitespace {

    @Test
    public void lastCharIsWhitespace_WillReturnTrueIfLastCharIsWhitespace() {
        StringBuilder sb = mock(StringBuilder.class);
        when("lastIndexOf(\\s)").thenReturn(-1);
        assertTrue(StringUtil.lastCharIsWhitespace(sb));
    }

}