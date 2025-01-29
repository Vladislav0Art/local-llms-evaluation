package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedNormaliseWhitespaceTests {

    @Test
    public void normaliseWhitespaceTests() {
        assertEquals("", normaliseWhitespace(""));
        assertEquals(" ", normaliseWhitespace("   "));
        assertEquals("\n", normaliseWhitespace("\n\r\n"));
    }

}