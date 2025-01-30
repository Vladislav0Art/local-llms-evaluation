package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.LeafNode;
import org.jsoup.nodes.Document;
import org.junit.Test;

import static org.junit.Assert.*;

public class GeneratedLastCharIsWhitespaceTest {

    @Test
    public void lastCharIsWhitespaceTest() {
        StringBuilder whitespaceSb = new StringBuilder("test ");
        StringBuilder noWhitespaceSb = new StringBuilder("test");

        assertTrue(TextNode.lastCharIsWhitespace(whitespaceSb));
        assertFalse(TextNode.lastCharIsWhitespace(noWhitespaceSb));
    }

}