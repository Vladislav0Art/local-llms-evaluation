package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedLastCharIsWhitespace_WithWhitespaceAtEnd {

    @Test
    public void lastCharIsWhitespace_WithWhitespaceAtEnd() {
        StringBuilder sb = new StringBuilder("Hello World ");
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}