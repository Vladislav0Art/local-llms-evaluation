package org.jsoup.nodes;

import org.jsoup.nodes.Appendable;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.junit.Test;

import java.io.IOException;

public class GeneratedCreateFromEncodedTests {

    @Test
    public void createFromEncodedTests() throws IOException {
        String encodedText = "Hello World";
        TextNode textNode = TextNode.createFromEncoded(encodedText);
        assertNotNull(textNode);
        assertEquals("Hello", textNode.getText());
    }

}