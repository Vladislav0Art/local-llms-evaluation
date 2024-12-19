package org.jsoup.nodes;

import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import static org.junit.Assert.*;

import java.io.IOException;

public class GeneratedCreateFromEncodedMethodUnescapesCorrectlyTest {

    public Document createDocument(String html) {
        return new org.jsoup.nodes.Document.Builder().html(html).build();
    }

    @Test
    public void createFromEncodedMethodUnescapesCorrectlyTest() throws IOException {
        String encodedText = "&lt;Hello&gt; World";
        Document documentBuilder = new org.jsoup.nodes.Document.Builder().html("text=" + encodedText).build();
        Element element = (Element) documentBuilder.head().firstChild();
        TextNode textNode = new TextNode(element.text());
        assertEquals("&lt;Hello&gt; World", textNode.text());
    }

}