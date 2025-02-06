package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.Arrays;

public class GeneratedLastCharIsWhitespace_GivenStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_GivenStringBuilder_ReturnsTrue() {
        StringBuilder sb = mock(StringBuilder.class);
        when(sb.length()).thenReturn(1);
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}