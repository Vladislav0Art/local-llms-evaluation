package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedLastCharIsWhitespaceTests {

    @Test
    public void lastCharIsWhitespaceTests() {
        assertEquals(" ", lastCharIsWhitespace(new StringBuilder()));
        assertEquals("\n\r\n", lastCharIsWhitespace(new StringBuilder("\n\r\n")));
        assertEquals("", lastCharIsWhitespace(new StringBuilder("   ")));
        assertEquals("World", lastCharIsWhitespace(new StringBuilder("Hello World")));
    }

}