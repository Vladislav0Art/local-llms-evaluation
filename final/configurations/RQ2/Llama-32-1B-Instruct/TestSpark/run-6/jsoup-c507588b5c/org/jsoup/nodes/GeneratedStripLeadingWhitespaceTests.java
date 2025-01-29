package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedStripLeadingWhitespaceTests {

    @Test
    public void stripLeadingWhitespaceTests() {
        assertEquals("", stripLeadingWhitespace(""));
        assertEquals("Hello World", stripLeadingWhitespace("Hello World"));
    }

}