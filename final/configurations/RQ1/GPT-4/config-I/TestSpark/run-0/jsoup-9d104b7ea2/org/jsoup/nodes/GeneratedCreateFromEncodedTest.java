package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.junit.*;

import static org.junit.Assert.*;

public class GeneratedCreateFromEncodedTest {


    // Test for normaliseWhitespace()

    @Test
    public void createFromEncodedTest() {
        TextNode textNode = TextNode.createFromEncoded("&lt;&gt;");
        assertEquals("<>", textNode.text());
    }

}