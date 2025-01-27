package org.jsoup.nodes;

import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;
import org.junit.Test;

import java.io.IOException;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

public class GeneratedLastCharIsWhitespace_GivenStringBuilder_ReturnsTrueIfLastCharacterIsWhitespace {

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsTrueIfLastCharacterIsWhitespace() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.length()).thenReturn(1);
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}