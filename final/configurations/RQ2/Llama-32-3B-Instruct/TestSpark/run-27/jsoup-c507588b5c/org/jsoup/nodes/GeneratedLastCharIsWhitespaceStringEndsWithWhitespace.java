package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.helper.Validate;

public class GeneratedLastCharIsWhitespaceStringEndsWithWhitespace {

    @Test
    public void lastCharIsWhitespaceStringEndsWithWhitespace() {
        String input = "Hello World";
        assertTrue(Document.OutputSettings.lastCharIsWhitespace(new StringBuilder(input).append(' ')));
    }

}