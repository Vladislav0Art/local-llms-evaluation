package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;
import org.jsoup.internal.StringUtil;

public class GeneratedLastCharIsWhitespace_NoWhitespace {

    @Test
    public void lastCharIsWhitespace_NoWhitespace() {
        StringBuilder sb = new StringBuilder("Hello World");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}