package org.jsoup.nodes;

import org.junit.Test;

import static org.junit.Assert.*;

import org.jsoup.nodes.Document;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder sb = new StringBuilder("Test text");
        assertFalse(TextNode.lastCharIsWhitespace(sb));
    }

}