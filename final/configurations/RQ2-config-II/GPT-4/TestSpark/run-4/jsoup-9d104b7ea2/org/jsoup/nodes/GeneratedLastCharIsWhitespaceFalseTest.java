package org.jsoup.nodes;

import org.junit.Test;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.TextNode;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceFalseTest {

    @Test
    public void lastCharIsWhitespaceFalseTest() {
        boolean isLastWhitespace = TextNode.lastCharIsWhitespace(new StringBuilder("testing"));
        assertFalse(isLastWhitespace);
    }

}