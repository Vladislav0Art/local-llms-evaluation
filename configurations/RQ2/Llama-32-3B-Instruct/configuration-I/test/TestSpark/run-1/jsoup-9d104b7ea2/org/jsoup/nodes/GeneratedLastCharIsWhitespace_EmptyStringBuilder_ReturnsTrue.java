package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;

public class GeneratedLastCharIsWhitespace_EmptyStringBuilder_ReturnsTrue {

    @Test
    public void lastCharIsWhitespace_EmptyStringBuilder_ReturnsTrue() {
        StringBuilder sb = new StringBuilder();
        assertTrue(TextNode.lastCharIsWhitespace(sb));
    }

}