package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        StringBuilder text = new StringBuilder("Test text");
        assertFalse(TextNode.lastCharIsWhitespace(text));
    }

}